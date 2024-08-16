package main.java.com.ohgiraffers.understand2.auth.impl;

import main.java.com.ohgiraffers.understand2.auth.SnsAuth;
import main.java.com.ohgiraffers.understand2.dto.MemberDTO;

public class NaverAuth implements SnsAuth {

    private final static MemberDTO[] membersDbN = new MemberDTO[10];
    static {membersDbN[0] = new MemberDTO("naver","naver");}

    @Override
    public boolean login(MemberDTO member) {

        if (membersDbN[0].getId().equals(member.getId()) &&
                membersDbN[0].getPwd().equals(member.getPwd())) {
            return true;
        }
        return false;
    }
}
