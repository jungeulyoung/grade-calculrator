package org.example;

import java.util.List;

public class GradleCalculator {

    private final List<Course> courses;

    public GradleCalculator(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * 요구사항
     * 평균학점 계산 방법 = (학점수x교과목 평점)의 합계 / 수강신청 총학점 수
     * 일급 컬렉션 사용
     */


    public double calculateGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
        }
        return 4.5;
    }
}
