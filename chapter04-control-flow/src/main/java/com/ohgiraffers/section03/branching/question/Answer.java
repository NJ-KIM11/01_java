package main.java.com.ohgiraffers.section03.branching.question;

import java.util.Scanner;

public class Answer {

    public void vendingMachine(){

        Scanner scr = new Scanner(System.in);
        String drink = "";
        String answer = "";
        int price = 0;
        int sum = 0;

        System.out.println("음료를 선택해주세요 : ");

        whole : do {
            String drinkPlus = scr.nextLine();
            switch (drinkPlus){
                case "사이다" :
                    drink += "사이다 ";
                    price = 500;
                    sum += price; break;
                case "콜라" :
                    drink += "콜라 ";
                    price = 600;
                    sum += price; break;
                case "환타" :
                    drink += "환타 ";
                    price = 700;
                    sum += price; break;
                case "박카스" :
                    drink += "박카스 ";
                    price = 1000;
                    sum += price; break;
                case "핫식스" :
                    drink += "핫식스 ";
                    price = 1500;
                    sum += price; break;
                default:
                    System.out.println("다시 선택해 주세요~~~~~~");
            }
            if(drinkPlus.equals("사이다") || drinkPlus.equals("콜라") || drinkPlus.equals("환타") || drinkPlus.equals("박카스") || drinkPlus.equals("핫식스")){
                System.out.println(drinkPlus + "를 선택 하셨습니다. \n계산 하시겠습니까?");

                answer = scr.nextLine();
                if(answer.equals("네")) {
                    continue;
                } else if(answer.equals("아니오")){
                    System.out.println("음료를 더 선택해주세요.");
                } else {
                    System.out.println("네 아니오 중에 선택해주세요.");
                }

                /*more : do {
                    answer = scr.nextLine();
                    switch (answer){
                        case "네" :
                            System.out.println("총 상풀은 " + drink + "\n총 금액은 " + sum + "원 입니다." ); break whole;
                        case "아니오" :
                            System.out.println("음료를 더 선택해주세요."); break more;
                        default:
                            System.out.println("네 아니오 중에 선택해주세요.");
                    }
                } while(!answer.equals("네") || !answer.equals("아니오"));*/
            }



        } while (!answer.equals("네"));

        System.out.println("총 상풀은 " + drink + "\n총 금액은 " + sum + "원 입니다." );

       /* System.out.println(drink + "를 선택 하셨습니다. \n계산 하시겠습니까?");

        String answer = "";
        do {
            answer = scr.nextLine();
            switch (answer){
                case "네" :
                    System.out.println("총 상풀은 " + drink + "\n총 금액은 " + price + "원 입니다." ); break;
                case "아니오" :
            }
        } while(true);*/
//        !drink.equals("사이다") || !drink.equals("콜라") || !drink.equals("환타") || !drink.equals("박카스") || !drink.equals("핫식스"




    }
}
