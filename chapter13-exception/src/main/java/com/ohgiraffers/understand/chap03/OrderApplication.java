package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderApplication {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        //제품 목록을 리스트로 미리 생성
        ArrayList<ProductDTO> productArrList = new ArrayList<>();
        productArrList.add(new ProductDTO("TV", 5000, 10));
        productArrList.add(new ProductDTO("신발", 1000, 20));
        productArrList.add(new ProductDTO("자전거", 3000, 5));






    }
}
