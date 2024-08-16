package main.java.com.ohgiraffers.understand2.service;

import main.java.com.ohgiraffers.understand2.auth.SnsAuth;
import main.java.com.ohgiraffers.understand2.dto.MemberDTO;

public class MemberService {

    SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }

    public boolean findMember(MemberDTO memberDTO) {

        return snsAuth.login(memberDTO);

    }

}
