package main.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*
         * 여러 명의 회원 정보를 한번에 등록
         * 전체 회원 조회시 여러명의 회원 정보를 한번에 반환
         *
         * MemberRepository - static 필드로 회원 정보들을 저장 (최대 10명까지)
         * */

        Scanner scr = new Scanner(System.in);   //사용자의 입력을 받기 위함

        MemberService memberService = new MemberService();
        //객체를 heap 에 생성하여 메소드를 실행할 준비.

        loop : while (true) {
            System.out.println("========== 회원 관리 프로그램 ===========");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = scr.nextInt();

            switch (no) {
                case 1 : memberService.signUpMembers();break;
                case 2 : memberService.showAllMembers();break;
                case 9 :
                    System.out.println("프로그램을 종료합니다."); break loop;
                default:
                    System.out.println("잘못된 번호입니다."); break;
            }
        }

    }

    /*
    * 1. main 메소드 실행 --> project 내에 모든 static 객체 메모리 할당
    * 2. Application 클래스 실행 --> while 문 --> scanner 입력 받음
    * 3. 1번실행시 --> MemberService 클래스의 signUpMembers 메소드 실행 -->
    * 4. 필드들을 매개변수로 가지는 객체들을  Member 배열
    * */
}
