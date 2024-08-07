package main.java.com.ohgiraffers.section01.conditional.question;

import java.util.Scanner;

public class QuestionMethod {

    public double average(int a, int b, int c){
        double average = (a+b+c)/3.0;
        System.out.println("세 과목 점수의 평균은 : " + average + " 입니다.");
        return average;
    }

    public void passFailStatement(int a, int b, int c, double avg){

        if(avg >= 60) {
            if(a >= 40 && b>= 40 && c>= 40) {
                System.out.println("합격 입니다.");
            } else {
                System.out.println("불합격 입니다.");
            }
        }
    }
}
