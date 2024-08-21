package main.java.com.ohgiraffers.section02.enumType;

public class Application {
    public static void main(String[] args) {

        //열거 타입으로 선언된 인스턴스는 싱글톤으로 관리된다.
        //new 연산자로 새로운 인스턴스를 만드는게 아니고 싱글톤으로
        Subjects subject1 = Subjects.JAVA;
        Subjects subject2 = Subjects.HTML;

        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        }else {
            System.out.println("두 과목은 다른 과목입니다.");
        }

        //단일 인스턴스임을 보장하기에 ==비교가 가능하다.
        //같은 주소값을 가진다.
        System.out.println(subject1 == Subjects.JAVA);

        //문자열로 변경하기 쉽다.
        System.out.println(Subjects.JAVA);
        System.out.println(Subjects.JAVA.toString());

        //values() 를 이용해서 상수값 배열을 반환하고
        //이를 연속 처리할 수 있다.
        Subjects[] subjects = Subjects.values();
        for (Subjects s : subjects) {
            System.out.println(s);
        }

        //타입 안전성을 보장한다.
        printSubjects(Subjects.HTML);

    }

    public static void printSubjects(Subjects subject) {
        System.out.println(subject.toString());
    }
}
