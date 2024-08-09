package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class HardQuestion {

    /*
     *  배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만들고,
     *  첫 번째로 큰 값을 출력하는 프로그램을 만들어 주세요. (잘하면 두번째로 큰 값도)
     *  만약 배열의 길이가 1 이하면 "1보다 짧은 길이의 배열은 두번쨰로 큰 수를 찾을 수 없습니다." 출력
     * */


    public static void main(String[] args) {

        System.out.println("배열의 길이를 입력해주세요 : ");
        Scanner scr = new Scanner(System.in);
        int arrLength = scr.nextInt();

        if(arrLength<1) {
            System.out.println("1보다 짧은 길이의 배열은 두번째로 큰 수를 찾을 수 없습니다.");
        }
        int[] arr = new int[arrLength];

        System.out.println("배열의 요소들을 입력해주세요 : ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scr.nextInt();
        }
        int maxNum = arr[0];
        int secondMaxNum = 0;
        int index =0;

        for (int i = 1; i < arrLength ; i++) {

            if(maxNum < arr[i] ) {
                maxNum = arr[i];
            }
            /*if(maxNum == secondMaxNum) {
                continue;
            }
            if(secondMaxNum < maxNum && secondMaxNum < arr[i]) {
                secondMaxNum = arr[i];
            }*/
            /*else if(maxNum == arr[i]) {
                continue;
            }*//* else if (maxNum > arr[i]) {
                secondMaxNum = arr[i];
            }*/

            /*if(secondMaxNum < maxNum && secondMaxNum < arr[i]) {
                secondMaxNum = arr[i];
            }*/
        }
        for (int i = 0; i < arrLength; i++) {
            if(secondMaxNum < maxNum && secondMaxNum < arr[i] && maxNum != arr[i]) {
                secondMaxNum = arr[i];
            }

        }

        /*for (int i = 0; i < arrLength; i++) {

            if(maxNum == secondMaxNum) {
                secondMaxNum = 0;
            }

            if(secondMaxNum < maxNum && secondMaxNum < arr[i]) {
                secondMaxNum = arr[i];
            }


        }*/

        System.out.println("배열에서 가장 큰 값은 : " + maxNum);
        System.out.println("배열에서 두번째로 큰 값은 : " + secondMaxNum);
    }
}
