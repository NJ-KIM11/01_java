package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanFromTwotoNine(){

        //for문 안에서 for문을 이용할 수 있다.

        //2~9단까지 쭉 출력

        for (int dan = 2; dan <= 9 ; dan++) {

            for (int su = 1; su < 10 ; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();

        }

    }

    public void printUpgradeGugudan(){

        //단을 2부터 9까지 증가시킨다.
        for (int dan = 2; dan <= 9 ; dan++) {

            printGugudan(dan);

            System.out.println();
        }
    }

    public void printGugudan(int dan){

        for (int su = 1; su < 10 ; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStars(){

        /*
        * 키보드로 정수를 입력 받아 해당 정수 만큼 한 행에 "*" 을 행의 번호개씩 출력 해주세요.
        *
        * 예시) 정수를 입력하세요 : 5
        *
        *   *
        *   **
        *   ***
        *   ****
        *   *****
        *
        * */

        Scanner scr = new Scanner(System.in);
        System.out.println("줄 수를 입력 해주세요 : ");
        int row = scr.nextInt();

        for (int i = 1; i <= row ; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print("*");      //줄 안넘김

            }
            System.out.println();
        }
    }

    public void reverseStars(){
        Scanner scr = new Scanner(System.in);
        System.out.println("줄 수를 입력 해주세요 : ");
        int row = scr.nextInt();

        for (int i = 1; i <=row ; i++) {

            for (int j = i; j <=row ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public void baekJoon1(){
        Scanner scr = new Scanner(System.in);
        System.out.println("줄 수를 입력 해주세요 : ");
        int row = scr.nextInt();

        for (int i = 1; i <=row ; i++) {

            for (int j = i; j <row ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public void baekJoon2(){
        Scanner scr = new Scanner(System.in);
        System.out.println("줄 수를 입력 해주세요 : ");
        int row = scr.nextInt();

        for (int i = 1; i <=row ; i++) {

            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= row ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void baekJoon3(){
       /* 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제

        별은 가운데를 기준으로 대칭이어야 한다.*/

        Scanner scr = new Scanner(System.in);
        System.out.println("줄 수를 입력 해주세요 : ");
        int row = scr.nextInt();

        for (int i = 1; i <= row ; i++) {

            for (int j = i; j < row ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= ((i*2)-1) ; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
