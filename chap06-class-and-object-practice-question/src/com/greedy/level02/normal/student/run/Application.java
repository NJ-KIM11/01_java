package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        StudentVO student1 = new StudentVO();
        student1.setGrade(scr.nextInt());
        student1.setGrade(scr.nextInt());
        student1.setName(scr.nextLine());
        student1.setHeight(scr.nextDouble());
        student1.setGender(scr.nextLine().charAt(0));
        student1.printInformation();


    }
}
