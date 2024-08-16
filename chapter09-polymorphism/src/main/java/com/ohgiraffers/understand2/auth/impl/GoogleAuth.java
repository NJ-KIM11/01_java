package main.java.com.ohgiraffers.understand2.auth.impl;

import main.java.com.ohgiraffers.understand2.auth.SnsAuth;
import main.java.com.ohgiraffers.understand2.dto.MemberDTO;

public class GoogleAuth implements SnsAuth {

    private final static MemberDTO[] membersDbG = new MemberDTO[10];
       static {membersDbG[0] = new MemberDTO("google","google");}

    @Override
    public boolean login(MemberDTO member) {

            if (membersDbG[0].getId().equals(member.getId()) &&
                    membersDbG[0].getPwd().equals(member.getPwd())) {
                return true;
            }
        return false;
    }



}