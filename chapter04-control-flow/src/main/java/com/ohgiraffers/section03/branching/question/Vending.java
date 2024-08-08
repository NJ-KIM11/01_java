package main.java.com.ohgiraffers.section03.branching.question;

import java.util.Scanner;

public class Vending {
    // 총 금액과 총 상품을 받을 변수 선언해놓기
    // 무한루프 반복문 만들기
    // 스캐너를 이용해 원하는 음료를 입력 받기
    // 스위치를 이용해 해당 음료의 가격과 상품 명을 총 금액, 상품 변수에 추가하기 +=
    // 계산여부 물어보기
    // 계산할거면 break 를 이용해 무한루프를 끊어주며 총 금액, 총 상품 출력
    // 안할거면 음료를 더 선택 해주세요 출력 후
    // 반복문 다시 반복

    public void vendingMachine(){
        String total = "";
        int totalPrice = 0;
        System.out.println("음료를 선택해 주세요 : ");
        Scanner sc = new Scanner(System.in);
        /*for(,,){
            System.out.println("사이다(500), 콜라(600), 환타(700), 박카스(1000), 핫식스(1500)");
            String name = sc.nextLine();
            if(name.equals("사이다")){
                total += name;
                totalPrice += 500;
            } else if(name.equals("콜라")){
                total += name;
                totalPrice += 600;
            } else if(name.equals("환타")){
                total += name;
                totalPrice += 700;
            } else if(name.equals("박카스")){
                total += name;
                totalPrice += 1000;
            } else if(name.equals("핫식스")) {
                total += name;
                totalPrice += 1500;
            } else {
                System.out.println("잘못된 음료입니다.");
                continue;
            }
            for(,,){
                System.out.println(total + "를 선택하셨습니다.");

            }
        }*/
    }

}
