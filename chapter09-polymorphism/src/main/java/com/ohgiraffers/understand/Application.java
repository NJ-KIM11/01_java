package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.understand.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.understand.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.understand.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        MemberService memberService = new MemberService();
        /*GoogleAuth googleAuth = new GoogleAuth();
        KakaoAuth kakaoAuth = new KakaoAuth();
        NaverAuth naverAuth = new NaverAuth();*/

        while (true) {
            System.out.println("=============== 로그인 및 회원가입 =================");
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");

            int no = scr.nextInt();
            switch (no) {
                case 1:
                    while (true) {
                        System.out.println("=========== 인증 방식 선택 ==========");
                        System.out.println("1. Google 인증");
                        System.out.println("2. Kakao 인증");
                        System.out.println("3. Naver 인증");

                        switch (scr.nextInt()) {
                            case 1 : memberService.auth();
                            case 2 : memberService.auth();
                            case 3 : memberService.auth();
                        }
                    }

                case 2 :

            }



        }



    }
}
