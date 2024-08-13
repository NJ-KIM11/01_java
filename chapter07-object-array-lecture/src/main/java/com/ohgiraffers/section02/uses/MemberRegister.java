package main.java.com.ohgiraffers.section02.uses;

public class MemberRegister {   //회원 등록을 repository에 명령하는 클래스

    public void regist(Member[] members){
        System.out.println("회원을 등록합니다.");

        for(Member member : members){
            System.out.println(member + "님 회원 등록 시도 합니다.");
        }
        if(MemberRepository.store(members)){    //MemberRepository 생성자를 안만든 이유는 static 이기 때문에 만들 필요가 없기 때문
            System.out.println("총 " + members.length + " 명의 회원이 등록 성공 했습니다.");
        }else {
            System.out.println("인원이 마감되어 등록에 실패했습니다.");
        }

    }
}
