package main.java.com.ohgiraffers.section04.scanner;

import java.util.Random;

import static main.java.com.ohgiraffers.section04.scanner.Question.test2;

public class Answer {
    public static void main(String[] args){

        int a = ((int)(Math.random()*201))-100;
        System.out.println(a);
        Question qmethod = new Question();
        System.out.println(qmethod.test(a));


        Random randnum = new Random();
        int b = ((int)(randnum.nextInt(201)-100));
        System.out.println(b);
        test2(b);
        System.out.println(test2(b)+qmethod.test3(b));


    }
}
