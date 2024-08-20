package main.java.com.ohgiraffers.understand.chap01;

import java.util.Scanner;

public class BankAccount {

    /*private int bankAccountNumber;
    private String accountOwnerName;
    private int balance;*/
    BankAccountDTO bankAccountDTO = new BankAccountDTO();

    public void deposit(int amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("입금은 양수만 가능");
        }else {
            bankAccountDTO.setBalance(bankAccountDTO.getBalance() + amount);
        }
    }

    public void withdraw(int amount) throws Exception{
        if (bankAccountDTO.getBalance() < amount) {
            throw new Exception("잔액이 부족합니다.");
        }else {
            bankAccountDTO.setBalance(bankAccountDTO.getBalance() - amount);
        }
    }

    public void makeAccount(){
        Scanner scr = new Scanner(System.in);
        System.out.println("============계좌 만들기===========");
        System.out.println("계좌 번호 입력 : ");
        bankAccountDTO.setBankAccountNumber(scr.nextInt());
        scr.nextLine();
        System.out.println("계좌 소유자 이름 : ");
        bankAccountDTO.setAccountOwnerName(scr.nextLine());
        bankAccountDTO.setBalance(0);

        System.out.println(bankAccountDTO);
    }

    public void balanceStatement(){
        System.out.println("잔액은 " + bankAccountDTO.getBalance() + " 원 입니다.");
    }



}
