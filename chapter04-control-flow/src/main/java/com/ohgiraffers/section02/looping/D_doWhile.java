package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {

    public void testSimpleDoWhileStatement(){

        /*
        * [do while 표현식]
        *
        * 초기식;
        * do {
        *       1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여
        *       조건식을 만족하는 경우에만 수행할 구문(반복할 구문);
        *       증감식;
        * }while(조건식);
        * */

        do {
            System.out.println("최초 한 번 동작됨.");
        }while(false);
        System.out.println("반복문 종료 확인");

    }

    public void testDoWhileStatement(){

        /*
        * 키보드로 문자열을 입력받아 반복적으로 출력한다.
        * 단, exit 가 입력되면 반복문을 종료한다.
        * */

        Scanner scr = new Scanner(System.in);
        String str = "";
        do {
            System.out.println("문자열을 입력해주세요 : ");
            str = scr.nextLine();
            System.out.println(str);
        } while(!str.equals("exit"));

        System.out.println("종료합니다.");
    }
}
