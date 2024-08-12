package com.greedy.level02.normal.student.model.vo;

public class StudentVO {

    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    public StudentVO() {
    }

    public StudentVO(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printInformation() {
        System.out.println("Grade : " + this.grade);
        System.out.println("Classroom : " + this.classroom);
        System.out.println("Name : " + this.name);
        System.out.println("Height : " + this.height);
        System.out.println("Gender : " + this.gender);
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "grade=" + grade +
                ", classroom=" + classroom +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }
}
