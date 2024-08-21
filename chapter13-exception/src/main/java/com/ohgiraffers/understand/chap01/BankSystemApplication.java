package main.java.com.ohgiraffers.understand.chap01;

import java.util.Scanner;

public class BankSystemApplication {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        int choice;

        while (true) {
            System.out.println("===============은행 프로그램===============");
            System.out.println("================ 메뉴 선택 ================");
            System.out.println("1. 계좌 만들기");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 잔액 조회");
            System.out.println("9. 프로그램 종료");
            choice = scr.nextInt();
            scr.nextLine();

            switch (choice) {
                case 1 : bankAccount.makeAccount();break;

                case 2 :
                    System.out.println("입금 금액 : ");
                    try {
                        bankAccount.deposit(scr.nextInt());
                        scr.nextLine();
                    }catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        bankAccount.balanceStatement();
                    }
                    break;

                case 3 :
                    System.out.println("출금 금액 : ");
                    try {
                        bankAccount.withdraw(scr.nextInt());
                        scr.nextLine();
                    }catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        bankAccount.balanceStatement();
                    }
                    break;

                case 4 :
                    bankAccount.balanceStatement();break;

                case 9 :
                    return;
                default:
                    System.out.println("잘못된 번호 선택입니다.");
            }
        }




    }
}
