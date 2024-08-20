package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class Application02 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try{
            et.checkEnoughMoney(1000,-500);
        }catch (NotEnoughMoneyException e){
            e.printStackTrace();
        }catch (PriceNegativeException | MoneyNegativeException e){         // |(or) 하나만 쓰는게 문법이다.
            // PriceNegativeException 와 MoneyNegativeException 같은 부모를 갖고 있기 때문에 같이 처리 가능
            e.printStackTrace();
        }finally {
            System.out.println("무조건 마지막에 동작함.");
        }
    }
}
