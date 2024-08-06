package main.java.com.ohgiraffers.section04.scanner;

import java.util.Random;

public class Question {

    /*
    * -100 ~ 100 사이의 난수를 발생 시켜서 인자로 전달하면
    * 매개변수가 양수면서 짝수면 X는 양수면서 짝수입니다. 양수면서 홀수면 X는 양수면서 홀수입니다.
    *          음수면서 짝수면 X는 음수면서 짝수입니다. 음수면서 홀수면 X는 양수면서 홀수입니다.
    * 를 반환하는 메소드를 다른 클래스에 생성해 메인메소드에서 호출한 후 화면에 출력해보자
    *  (static / non-static 한번씩)
    * */

    public static void main(String[] args) {
        int a = ((int)(Math.random()*201))-100;
        System.out.println(a);

        Question q = new Question();
        System.out.println(q.test(a));


        Random randomN = new Random();
        int b = ((int)(randomN.nextInt(201)-100));
        System.out.println(b);
        System.out.println(test2(b) + test3(b));


    }

    public String test (int a) {
        String statement = (a > 0 && (a%2)==0) ? "양수면서 짝수 입니다." : (a > 0 && (a%2)!=0) ? "양수면서 홀수 입니다."
                            : (a < 0 && (a%2)==0) ? "음수면서 짝수 입니다." : "음수면서 홀수입니다.";
        return statement;

    }

    public static String test2(int a) {
        String firstStatement = (a > 0) ? "양수면서 " : "음수면서 ";
        return firstStatement;

    }

    public static String test3(int a){
        String secondStatement = ((a % 2)==0) ? "짝수 입니다." : "홀수 입니다.";
        return secondStatement;

    }



}
