package main.java.com.ohgiraffers.section05.logical;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 논리 연산자의 우선순위 활용
        * 논리 and 연산자와 or 연산자의 우선 순뤼
        * && : 11순위
        * || : 12순위
        * 논리 and 연산자가 or 연산자보다 우선순위가 높다.
        * */

        //  ( 1 <= 변수 <= 100)       불가
        int num1 = 55;
        System.out.println("1부터 100 사이 인지 확인 : " + ((num1 >= 1) && (num1 <=100)));
        //System.out.println(1 <= num1 <= 100);       불가

        //영어 대문자인지 확인
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + ((ch1 >= 'A') && (ch1 <= 'Z')));
        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + ((ch2 >= 'A') && (ch2 <= 'Z')));

        //대소문자 상관없이 영문자 y 인지를 확인
        char ch3 = 'Y';
        char ch4 = 'y';
        System.out.println("y 인지 확인 :" + ((ch3 == 'y') || (ch3 == 'Y') ));
        System.out.println("y 인지 확인 :" + ((ch4 == 'y') || (ch4 == 'Y') ));

        //영문자인지 확인
        //아스키코드 이용해서 확인 a=97, z = 122, A = 65, Z = 90
        int inum3 = ch3;
        int inum4 = ch4;
        System.out.println("영문자 인지 확인 :" + (((ch3 >= 'A') && (ch3 <= 'Z')) || ((ch3 >= 'a') && (ch3 <= 'z')) ));
        System.out.println("영문자 인지 확인 :" + (((ch4 >= 'A') && (ch4 <= 'Z')) || ((ch4 >= 'a') && (ch4 <= 'z')) ));

        System.out.println(inum3);
        System.out.println(inum4);
        System.out.println("영문자 인지 확인 :" + (((inum3 >= 97) && (inum3 <= 122)) || ((inum3 >= 65) && (inum3 <= 90)) ));
        System.out.println("영문자 인지 확인 :" + (((inum4 >= 97) && (inum4 <= 122)) || ((inum4 >= 65) && (inum4 <= 90)) ));

    }
}
