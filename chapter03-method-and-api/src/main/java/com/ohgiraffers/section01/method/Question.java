package main.java.com.ohgiraffers.section01.method;

public class Question {
    public static void main(String[] args){

        /*
        * 만들어보자
        * 두 수를 매개변수로 받아 더한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 뺀 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 나눈 값을 반환하는 메소드
        * */

        Question calculator = new Question();
        int sum = calculator.plusMethod(10,2);
        System.out.println("sum is " + sum);

        int diff = calculator.minusMethod(10,2);
        System.out.println("difference is " + diff);

        int product = calculator.multiplyMethod(10,2);
        System.out.println("product is " + product);

        int quotient = calculator.divideMethod(10,2);
        System.out.println("quotient is " + quotient + "\n");

        System.out.println("두 수의 합, 차, 곱, 몫은 " + sum + ", "+ diff + ", " + product + ", " + quotient);

    }

    public int plusMethod(int a, int b){
        System.out.println("두 수의 합은 " + (a + b));
        return a+b;
    }

    public int minusMethod(int a, int b){
        System.out.println("두 수의 차는 " + (a - b));
        return a-b;
    }

    public int multiplyMethod(int a, int b){
        System.out.println("두 수의 곱은 " + (a*b));
        return a*b;
    }

    public int divideMethod(int a, int b){
        System.out.println("두 수의 몫은 " + (a/b));
        return a/b;
    }

}
