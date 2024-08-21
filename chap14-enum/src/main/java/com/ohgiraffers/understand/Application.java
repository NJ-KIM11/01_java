package main.java.com.ohgiraffers.understand;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Functions functions = new Functions();
        int choice;
        String studentName;
        int studentID;
        int grade;
        int score;

        while (true) {
            System.out.println("================= 학생 성적 관리 시스템 =================");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학년별 학생 목록 보기");
            System.out.println("3. 성적 수정");
            System.out.println("4. 학생 정보 삭제");
            System.out.println("9. 프로그램 종료");
            choice = scr.nextInt();
            scr.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("==== 학생 추가 기능 ====");
                    System.out.println("이름 : ");
                    studentName = scr.nextLine();
                    System.out.println("학번 : ");
                    studentID = scr.nextInt();
                    scr.nextLine();
                    System.out.println("학년 : ");
                    grade = scr.nextInt();
                    scr.nextLine();
                    System.out.println("성적 : ");
                    score = scr.nextInt();
                    scr.nextLine();
                    functions.addStudent(studentName, studentID, grade, score);

            }


        }

    }
}
