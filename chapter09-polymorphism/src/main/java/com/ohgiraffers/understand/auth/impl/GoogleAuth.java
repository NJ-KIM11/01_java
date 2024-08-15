package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;
import main.java.com.ohgiraffers.understand.service.MemberService;

public class GoogleAuth extends MemberService implements SnsAuth{

    @Override
    public void loginCheck(MemberDTO memberDTO, int authNum) {
        super.loginCheck(memberDTO, authNum);
    }

    @Override
    public void auth() {

    }



}
