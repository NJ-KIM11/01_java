package main.java.com.ohgiraffers.section01.method;

public class Calculator {

    //둘 중 작은값을 리턴

    public int minNumberOf(int first, int second) {
        return(first>second) ? second : first;
    }

    //둘 중 큰값을 리턴
    public static int maxNumberOf(int first, int second){
        return(first>second) ? first : second;
    }
}
