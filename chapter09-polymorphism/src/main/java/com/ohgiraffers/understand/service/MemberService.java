package main.java.com.ohgiraffers.understand.service;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.understand.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.understand.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

import java.util.Scanner;

public class MemberService {

    /*Scanner scr = new Scanner(System.in);
    SnsAuth snsAuthG = new GoogleAuth();
    SnsAuth snsAuthK = new KakaoAuth();
    SnsAuth snsAuthN = new NaverAuth();
    MemberDTO memberDTO = new MemberDTO();*/
    private final static MemberDTO[][] membersDb = new MemberDTO[3][];


    public void loginCheck(MemberDTO memberDTO, int authNum) {
        int dbArrayNum = authNum - 1;
        for (int i = 0; i < membersDb[dbArrayNum].length; i++) {
            if (memberDTO.getId().equals(membersDb[dbArrayNum][i].getId()) &&
                    memberDTO.getPwd().equals(membersDb[dbArrayNum][i].getPwd())) {
                System.out.println("로그인 성공"); return;
            }
        }
        System.out.println("아이디 또는 비밀번호가 맞지 않습니다.");
    }

    /*public int login(int authNum){
        System.out.println("아이디 입력 : ");
        memberDTO.setId(scr.nextLine());
        System.out.println("비밀번호 입력 : ");
        memberDTO.setPwd(scr.nextLine());

        switch(authNum){
            case 1 :
                snsAuthG.loginCheck(memberDTO, authNum);
            case 2 :
                snsAuthK.loginCheck(memberDTO, authNum);
            case 3 :
                snsAuthN.loginCheck(memberDTO, authNum);

        }

     return 0;
    }*/




}
