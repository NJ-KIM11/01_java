package main.java.com.ohgiraffers.section01.intEnum;

public class Application {
    public static void main(String[] args) {

        //정수 열거 패턴의 단점을 이해할 수 있다.

        int subject1 = Subjects.JAVA;
        int subject2 = Subjects2.HTML;

        //정수 값만을 가지고 있는 필드일 뿐이다.
        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        }
        //JAVA 와 HTML 이라는 다른 필드 이지만 정수 값만을 가지고 있기 때문에 같은 값으로 인식

        //문자열로 출력하기 불편하다.
        int num = 0;
        String subjectName = "";
        switch (num) {
            case Subjects.JAVA : subjectName = "Java"; break;
            case Subjects.MYSQL: subjectName = "MySQL"; break;
            case Subjects.JDBC: subjectName = "JDBC"; break;
        }
        System.out.println("subjectName = " + subjectName);

        //타입 안전을 보장할 수 없다. (정수를 사용하기 때문에)
        printSubject(Subjects.MYSQL);
        printSubject(2);


    }

    public static void printSubject(int subjectNumber) {
        String subjectName = "";
        switch (subjectNumber) {
            case Subjects.JAVA : subjectName = "Java"; break;
            case Subjects.MYSQL: subjectName = "MySQL"; break;
            case Subjects.JDBC: subjectName = "JDBC"; break;
        }
        System.out.println("subjectName = " + subjectName);
    }
}
