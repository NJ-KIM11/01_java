package main.java.com.ohgiraffers.understand2;

import main.java.com.ohgiraffers.understand2.auth.SnsAuth;
import main.java.com.ohgiraffers.understand2.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.understand2.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.understand2.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.understand2.dto.MemberDTO;
import main.java.com.ohgiraffers.understand2.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        MemberDTO memberDTO = new MemberDTO();
        MemberService memberService;
        boolean result;

        while (true) {
            System.out.println("==========로그인========");
            System.out.println("아이디 입력 : ");
            memberDTO.setId(scr.nextLine());
            System.out.println("비밀번호 입력 : ");
            memberDTO.setPwd(scr.nextLine());

            System.out.println("=========== 로그인 인증 방식 선택 ==========");
            System.out.println("1. Google 인증");
            System.out.println("2. Kakao 인증");
            System.out.println("3. Naver 인증");

            int choice = scr.nextInt();
            scr.nextLine();

            switch (choice) {
                case 1:
                    memberService = new MemberService(new GoogleAuth());
                    result = memberService.findMember(memberDTO);
                    if (result) {
                        System.out.println("google로그인에 성공하였습니다. " + memberDTO.getId());
                        return;
                    }
                    break;
                case 2:
                    memberService = new MemberService(new KakaoAuth());
                    result = memberService.findMember(memberDTO);
                    if (result) {
                        System.out.println("kakao로그인에 성공하였습니다. " + memberDTO.getId());
                        return;
                    }
                    break;
                case 3:
                    memberService = new MemberService(new NaverAuth());
                    result = memberService.findMember(memberDTO);
                    if (result) {
                        System.out.println("naver 로그인에 성공하였습니다.. " + memberDTO.getId());
                        return;
                    }
                    break;
                case 9:
                    System.out.println("로그인을 종료합니다.");
                    return;
            }



        }

    }
}
