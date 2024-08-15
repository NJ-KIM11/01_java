package main.java.com.ohgiraffers.understand.auth;

import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public interface SnsAuth {

//    MemberDTO[][] membersDb = new MemberDTO[3][];

    void auth();

    /*static void loginCheck(MemberDTO memberDTO, int authNum) {
        int dbArrayNum = authNum - 1;
        for (int i = 0; i < membersDb[dbArrayNum].length; i++) {
            if (memberDTO.getId().equals(membersDb[dbArrayNum][i].getId()) &&
                memberDTO.getPwd().equals(membersDb[dbArrayNum][i].getPwd())) {
                System.out.println("로그인 성공"); return;
            }
        }
        System.out.println("아이디 또는 비밀번호가 맞지 않습니다.");
    }*/

}
