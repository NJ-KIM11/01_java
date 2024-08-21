package main.java.com.ohgiraffers.understand;

public class StudentDTO {

    private String studentName;
    private int studentID;
    private int grade;
    private int score;

    public StudentDTO() {
    }

    public StudentDTO(String studentName, int studentID, int grade, int score) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.grade = grade;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }
}
