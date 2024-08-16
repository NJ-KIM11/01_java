package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;
import main.java.com.ohgiraffers.understand.service.MemberService;

public class NaverAuth extends MemberService implements SnsAuth {

    private final static MemberDTO[] membersDb = new MemberDTO[10];


    @Override
    public void loginAuth(MemberDTO memberDTO) {
        for (int i = 0; i < membersDb.length; i++) {
            if (membersDb[i].getId().equals(memberDTO.getId()) && membersDb[i].getPwd().equals(memberDTO.getPwd())) {
                System.out.println("Naver 로그인 성공");
                return;
            }
        }
        System.out.println("Google 아이디 또는 비밀번호가 맞지 않습니다.");

    }

    @Override
    public void signupAuth(MemberDTO memberDTO) {

    }
}
