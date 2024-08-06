package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args){

        /*
        * nextLine() : 공백을 포함한 한 줄을 입력. 개행문자(Enter) 전까지 읽어서 반환 (개행문자 포함)
        * next() : 공백문자(Spacebar)나 개행문자(Enter) 전까지를 읽어서 반환 (공백문자 미포함)
        * */

        Scanner scr = new Scanner(System.in);
        System.out.println("값을 입력 해주세요 : ");
        String greeting = scr.nextLine();
        System.out.println(greeting);

        System.out.println("두번째 값을 입력 해주세요 : ");
        String greeting2 = scr.next();
        System.out.println(greeting2);



    }
}
