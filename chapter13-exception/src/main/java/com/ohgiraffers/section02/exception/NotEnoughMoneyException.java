package main.java.com.ohgiraffers.section02.exception;

public class NotEnoughMoneyException extends Exception{
    //Exception을 만들기 위해서는 Exception을 상속받는다.


    public NotEnoughMoneyException() {
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }


}
