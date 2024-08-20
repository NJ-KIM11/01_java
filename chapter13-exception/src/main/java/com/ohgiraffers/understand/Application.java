package main.java.com.ohgiraffers.understand;

import java.util.Scanner;

public class Application {

    Scanner scr = new Scanner(System.in);

    public void calc() throws cantDivideByZeroException, wrongOperatorException {
        System.out.println("정수 입력 : ");
        int a = scr.nextInt();
        scr.nextLine();
        System.out.println("연산자 입력 : ");
        char c = scr.nextLine().charAt(0);
        System.out.println("정수 입력 : ");
        int b = scr.nextInt();
        double result=0;

        if(c == '+'){
            result = a + b;
        }
        else if(c == '-'){
            result = a - b;
        }
        else if(c == '*'){
            result = a * b;
        }
        else if(c == '/'){
            if(b == 0){
                throw new cantDivideByZeroException("0으로 나누기 불가");
            }
            result = a / b;
        }
        else {
            throw new wrongOperatorException("연산자 예외처리");
        }
        System.out.println(result);


    }
}
