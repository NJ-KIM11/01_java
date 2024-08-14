package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Application {  //실행부
    public static void main(String[] args) {

        /*회원 가입은 10명까지 가능
        -가입한 회원이 없는 상태에서 로그인을 시도하면 가입한 회원이 없습니다. 출력
        -정상적으로 가입 후 로그인시 로그인 완료 출력되고 프로그램 종료
        -서비스에서 아이디, 이름, 비밀번호, 비밀번호 확인을 물어본 후
        -비밀번호와 비밀번호 확인이 같을 시에만 가입 진행*/

        Scanner scr = new Scanner(System.in);
        LoginService loginService = new LoginService();
        boolean isTrue = true;

        loop :while(isTrue){

            System.out.println("=============회원가입 및 로그인 시스템===============");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = scr.nextInt();

            switch(no){
                case 1: loginService.signUpUsers();break;
                case 2: isTrue = loginService.logIn();break;
                case 9:break loop;
                default:
                    System.out.println("잘못된 번호 입니다."); break;
            }

        }
    }

}
