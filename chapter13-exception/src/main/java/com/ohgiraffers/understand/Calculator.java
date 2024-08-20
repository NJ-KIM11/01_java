package main.java.com.ohgiraffers.understand;

public class Calculator {
    public static void main(String[] args) {

        /*
        * 사용자에게 숫자 두개와 연산자를 입력 받습니다.
        * 입력된 연산을 수행하여 결과를 출력합니다.
        * / 는 0 으로 할 수 없기 때문에 예외처리 해주시고
        * 사용자가 잘못된 연산자를 입력하면 예외처리 해주세요
        * */

        Application app = new Application();

        try{
            app.calc();

        }catch (cantDivideByZeroException e){
            e.printStackTrace();
        }catch (wrongOperatorException e){
            e.printStackTrace();
        }



    }
}
