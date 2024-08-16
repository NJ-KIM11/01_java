package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.understand.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.understand.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;
import main.java.com.ohgiraffers.understand.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        MemberService memberService = new MemberService();
        /*SnsAuth snsAuthG = new GoogleAuth();
        SnsAuth snsAuthK = new KakaoAuth();
        SnsAuth snsAuthN = new NaverAuth();
        MemberDTO memberDTO = new MemberDTO();*/

        while (true) {
            System.out.println("=============== 로그인 및 회원가입 =================");
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");

            int no = scr.nextInt();
            switch (no) {
                case 1 :
                    while (true) {
                        System.out.println("=========== 인증 방식 선택 ==========");
                        System.out.println("1. Google 인증");
                        System.out.println("2. Kakao 인증");
                        System.out.println("3. Naver 인증");

                        int authNum1 = scr.nextInt();
                        scr.nextLine();
                        memberService.login(authNum1);
                    }
                case 2 :
                    System.out.println("=========== 회원 가입 방식 선택 ==========");
                    System.out.println("1. Google 인증");
                    System.out.println("2. Kakao 인증");
                    System.out.println("3. Naver 인증");

                    int authNum2 = scr.nextInt();
                    scr.nextLine();
                    memberService.signUp(authNum2);

            }



        }



    }
}
