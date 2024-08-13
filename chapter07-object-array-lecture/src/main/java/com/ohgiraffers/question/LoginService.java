package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class LoginService { //회원가입, 로그인 메소드 처리
    private String id;
    private String name;
    private String pwd;
    private String pwdAgain;
    Scanner scr = new Scanner(System.in);

    public void signUpUsers(){


        User user = new User();

        sloop : while(true){
            System.out.println("----------회원 가입 시작----------");
            System.out.println("아이디 : ");
            id = scr.nextLine();
            System.out.println("이름 : ");
            name = scr.nextLine();
            System.out.println("비밀번호 : ");
            pwd = scr.nextLine();
            System.out.println("비밀번호 확인 : ");
            pwdAgain = scr.nextLine();

            if(pwd.equals(pwdAgain)){
                user = new User(id, name, pwd);
                System.out.println("---회원 가입 완료---"); break sloop;
            } else {
                System.out.println("비밀번호와 비밀번호 확인이 같지 않습니다. ");
            }
        }
        LoginRepository loginRepository = new LoginRepository();
        if (loginRepository.db(user)){
            System.out.println(user + "님의 정보가 db에 추가 되었습니다.");
        } else {
            System.out.println("회원가입 불가");
        }

    }

    public void login(){
        System.out.println("----------로그인 시작----------");
        System.out.println("아이디 : ");
        id = scr.nextLine();
        System.out.println("비밀번호 : ");
        pwd = scr.nextLine();

//        User user = new User(id, pwd);
        LoginRepository loginRepository = new LoginRepository();
        if(loginRepository.loginCheck(id,pwd)){
            System.out.println("로그인 완료!!");
            return;
        } else {
            System.out.println("가입한 회원이 없습니다.");

        }


    }

}
