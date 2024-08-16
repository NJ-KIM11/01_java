package main.java.com.ohgiraffers.understand2.auth.impl;

import main.java.com.ohgiraffers.understand2.auth.SnsAuth;
import main.java.com.ohgiraffers.understand2.dto.MemberDTO;

public class KakaoAuth implements SnsAuth {

    private final static MemberDTO[] membersDbK = new MemberDTO[10];
    static {membersDbK[0] = new MemberDTO("kakao","kakao");}

    @Override
    public boolean login(MemberDTO member) {

        if (membersDbK[0].getId().equals(member.getId()) &&
                membersDbK[0].getPwd().equals(member.getPwd())) {
            return true;
        }
        return false;
    }
}
