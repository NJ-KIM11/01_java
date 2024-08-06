package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){

        /*
        * java.util.scanner
        * 콘솔 화면에 값을 입력 받는 기능을 제공한다.
        * */

        Scanner scr = new Scanner(System.in);
        //System.in 은 시스템에 입력을 허용한다는 뜻

        System.out.println("이름을 입력 해주세요 : ");
        String name = scr.nextLine();
        System.out.println("안녕하세요 " + name + "님!");

        System.out.println("나이를 입력 해주세요 : ");
        int age = scr.nextInt();
        System.out.println("입력하신 나이가" + age + "세가 맞으세요?");

        System.out.println("금액을 입력 해주세요 : ");
        long lnum = scr.nextLong();
        System.out.println("입력하신 금액 : " + lnum);

        //실수
        System.out.println("원하는 실수를 입력 해주세요 : ");
        double number = scr.nextDouble();       //형변환
        System.out.println("입력하신 실수는 " + number + " 입니다.");

        //논리형
        System.out.println("true or false 입력 : ");
        boolean isTrue = scr.nextBoolean();

        if(isTrue){
            System.out.println("참이다.");
        }else{
            System.out.println("거짓이다.");
        }

        scr.nextLine();
        //nextLine() 이외에 scanner 클래스 안에 메소드 사용시 다음 nextLine() 사용전에 scr.nextLine() 으로 슬롯을 비워주어야 한다.
        //이전에 사용한 nextInt() 등 사용중에 입력후 Enter까지 인식이 되었기 때문에


        //문자형 값 입력
        System.out.println("아무 문자나 입력 해주세요 : ");
        char charValue = scr.nextLine().charAt(0);
        System.out.println(charValue);



    }
}
