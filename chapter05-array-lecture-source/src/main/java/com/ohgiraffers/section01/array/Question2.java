package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        /*  -- 심화
         * 배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만든 후,
         * 배열에서 중복된 값을 모두 제거한 후 남은 값을 오름차순으로 출력하는 프로그램을 작성하세요.
         * 만약 배열의 길이가 0이면 "빈 배열입니다."를 출력하세요.
         */

        Scanner scr = new Scanner(System.in);
        System.out.println("배열의 길이를 입력해주세요 : ");

        int arrLength = scr.nextInt();
        if (arrLength == 0) {
            System.out.println("빈 배열입니다.");
        }
        int[] array1 = new int[arrLength];

        System.out.println("배열의 요소들을 입력해주세요 : ");
        for (int i = 0; i < arrLength; i++) {
            array1[i] = scr.nextInt();
        }
        for (int i = 1; i < arrLength; i++) {
            for (int j = 0; j < i; j++) {
                if (array1[i] < array1[j]) {
                    int temp;
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        for (int i = 0; i < arrLength; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        //중복값은 0으로 만들기
        for (int i = 0; i < arrLength; i++) {
            for (int j = i+1; j < arrLength ; j++) {
                if (array1[i] == array1[j]) {
                    array1[j] = 0;

                }
            }
        }

        //0은 빼고 읽기
        for (int i = 0; i < arrLength; i++) {
            if(array1[i] != 0){
                System.out.print(array1[i] + " ");
            }
        }



        /*int minNum = array1[0];
        int secondNum = array1[0];
        for (int i = 0; i < arrLength; i++) {
            for (int j = i + 1; j < arrLength; j++) {
                if (array1[i] > array1[j]) {
                    array2[i] = array1[j];
                }

                array2[i] = minNum;
                secondNum = minNum;
            }
        }
        for (int j = 0; j < arrLength; j++) {
            System.out.println(array2[j]);
        }*/





        /*int[] newArray  = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }
        newArray[0] = minNum;
        for (int i = 0; i < arrLength; i++) {
            if (array[i] > minNum) {

            }

        }*/


            /*for (int j = i+1; j < arrLength ; j++) {
                if (array[i] == array[j]) {


                }

            }*/

            /*if (minNum > array[i]) {
                minNum = array[i];
            }
            newArray[i] = minNum;*/




    }
}
