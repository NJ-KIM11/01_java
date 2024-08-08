package main.java.com.ohgiraffers.section01.array;

import java.util.Random;

public class Question {
    public static void main(String[] args) {

        //트럼프 카드를 랜덤으로 한장 출력해보자

        String[] trumpsym = {"Diamond", "Spade", "Heart", "Clover"};
        String[] trumpnum = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};

        Random rd = new Random();
        int num1 = rd.nextInt(trumpsym.length);
        int num2 = rd.nextInt(trumpnum.length);

        String randomTrump = trumpsym[num1] + trumpnum[num2];
        System.out.println(randomTrump);

    }
}
