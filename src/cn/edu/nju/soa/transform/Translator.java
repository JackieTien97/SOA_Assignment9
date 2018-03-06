package cn.edu.nju.soa.transform;

import cn.edu.nju.soa.model.CourseScore;
import cn.edu.nju.soa.model.CourseScoreList;
import cn.edu.nju.soa.model.ScoreType;
import cn.edu.nju.soa.model.StudentList;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Thpffcj on 2018/3/6.
 */
public class Translator {

    public static CourseScoreList convert(StudentList studentList) {
        CourseScoreList scoreList = new CourseScoreList();

        List<CourseScore> tempList = studentList.getStudents().stream()
                .flatMap(student -> student.getStuGrade().get(0).getStudent().get(0).getStudentScores().getScoreDetail().stream()
                .flatMap(score -> score.getScoreList().getCourseScore().stream()))
                .collect(Collectors.toList());

        List<CourseScore> resultList = new LinkedList<>();
        for (CourseScore courseScore: tempList) {
            boolean isRepeat = false;
            int repeatIndex = 0;
            for (; repeatIndex < resultList.size(); repeatIndex++) {
                CourseScore testScore = resultList.get(repeatIndex);
                if (testScore.getCourseId().equals(courseScore.getCourseId())
                        && testScore.getScoreType().equals(courseScore.getScoreType())) {
                    isRepeat = true;
                    break;
                }
            }
            if (isRepeat) {
                List<ScoreType> scores = resultList.get(repeatIndex).getScore();
                scores.addAll(courseScore.getScore());
                scores.sort(Comparator.comparingInt(ScoreType::getScore));
            } else {
                resultList.add(courseScore);
            }
        }
        resultList.sort(Comparator.comparingInt(c -> Integer.parseInt(c.getCourseId())));
        scoreList.setCourseScore(resultList);
        return scoreList;
    }

    public static CourseScoreList convert(CourseScoreList scoreList) {

        for (CourseScore courseScore: scoreList.getCourseScore()) {
            courseScore.setScore(courseScore.getScore().stream()
                    .filter(score -> score.getScore() < 60).collect(Collectors.toList()));
        }

        scoreList.setCourseScore(scoreList.getCourseScore().stream()
                .filter(courseScore -> courseScore.getScore().size()>0).collect(Collectors.toList()));
        return scoreList;
    }
}
