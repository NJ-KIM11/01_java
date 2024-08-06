package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        //        계산기 만들기
//        계산기에 필요한 기능은 + , - , * , / , %  총 5가지 연산자다.
//        ((예시))
//        첫 번 째 숫자를 입력하세요 :
//        2
//        연산할 기호를 쓰세요 :
//        +
//        두 번 째 숫자를 입력하세요 :
//        2
//        결과는 4입니다

        Scanner scr = new Scanner(System.in);
        System.out.println("첫 번 째 숫자를 입력하세요 : ");
        int num1 = scr.nextInt();

        scr.nextLine();

        System.out.println("연산할 기호를 쓰세요 : ");
        char symbol = scr.nextLine().charAt(0);
        int symnum = symbol;

        System.out.println("두 번 째 숫자를 입력하세요 : ");
        int num2 = scr.nextInt();

        System.out.println("일단" + num1 + symnum + num2);

        int resultnum = (symbol == '+') ? num1 + num2 : (symbol == '-') ? num1 - num2 : (symbol == '*') ? num1 * num2
                : (symbol == '/') ? num1 / num2 : num1 % num2;

        System.out.println("" + num1 + symbol + num2 + "\n결과는 " + resultnum + " 입니다.");


        //char 를 int로 변환해서 유니코드로 비교한 결과
        /*int resultnum = (symnum == 43) ? num1 + num2 : (symnum == 45) ? num1 - num2 : (symnum == 42) ? num1 * num2
                : (symnum == 47) ? num1 / num2 : num1 % num2;

        System.out.println("" + num1 + symbol + num2 + "\n결과는 " + resultnum + " 입니다.");*/



        /*char fsymbol = (char)symnum;
        System.out.println(fsymbol);

        int resultnum = num1 fsymbol num2;*/

    }
}
