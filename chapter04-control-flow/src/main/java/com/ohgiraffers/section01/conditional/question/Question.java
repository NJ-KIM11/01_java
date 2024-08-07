package main.java.com.ohgiraffers.section01.conditional.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*
         * a,b,c 세 과목의 점수를 스캐너로 입력받고 세 과목의 점수를
         * 메소드를 생성해 매개변수로 전달해 평균을 계산하고, --메소드 1
         *
         * 평균과 점수를 이용하여 합격 / 불합격 처리하는 기능을 구현 해주세요. --메소드 2
         *
         * (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서, 평균이 60점을 넘어야함.)
         * 합격 했을 경우에는 평균 점수와 "합격입니다" 를 출력하고,
         * 불합격인 경우에는 "불합격입니다." 라고 출력 해주세요.
         *
         * */

        Scanner scr = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        int score1 = scr.nextInt();
        int score2 = scr.nextInt();
        int score3 = scr.nextInt();

        QuestionMethod q = new QuestionMethod();
        double average = q.average(score1, score2, score3);
        q.passFailStatement(score1, score2, score3, average);




    }


}
