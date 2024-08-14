package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class LoginService { //회원가입, 로그인 메소드 처리

    Scanner scr = new Scanner(System.in);

    public void signUpUsers(){


        User user = new User();

        sloop : while(true){
            System.out.println("----------회원 가입 시작----------");
            System.out.println("아이디 : ");
            user.setId(scr.nextLine());
            System.out.println("이름 : ");
            user.setName(scr.nextLine());
            System.out.println("비밀번호 : ");
            user.setPwd(scr.nextLine());
            System.out.println("비밀번호 확인 : ");
            user.setPwdAgain(scr.nextLine());

            if(user.getPwd().equals(user.getPwdAgain())){
                break sloop;
            } else {
                System.out.println("비밀번호와 비밀번호 확인이 같지 않습니다. ");
            }
        }

        if (LoginRepository.db(user)){
            System.out.println(user + "님의 정보가 db에 추가 되었습니다.");
        } else {
            System.out.println("회원가입 불가");
        }

    }

    public boolean logIn(){
        User user = new User();
        System.out.println("----------로그인 시작----------");
        System.out.println("아이디 : ");
        user.setId(scr.nextLine());
        System.out.println("비밀번호 : ");
        user.setPwd(scr.nextLine());

        if(LoginRepository.loginCheck(user)){
            System.out.println("로그인 완료!!");
            return false;
        } else {
            System.out.println("회원 가입 먼저 해주세요~");
            return true;
        }

    }

}
