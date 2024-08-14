package main.java.com.ohgiraffers.question;

public class LoginRepository {  //회원 가입 처리, 로그인 처리

    private final static User[] usersDb = new User[10];
    private static int count;

    /*public void signUp(User user){
        users[count++] = user;
    }*/

    public static boolean db(User user) {
        if(count != 10) {
            usersDb[count++] = user;
            System.out.println("회원 가입 완료");
        } else {
            System.out.println("회원 정원 초과");
            return false;
        }
        return true;
    }

    public static boolean loginCheck(User signingInUser) {
        if (usersDb[0] == null){
            System.out.println("가입된 회원이 없습니다.");
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (usersDb[i].getId().equals(signingInUser.getId()) && usersDb[i].getPwd().equals(signingInUser.getPwd())){
                System.out.println("id check, pwd check --> 로그인 성공");
                return true;
            }
        }

        /*for(User user : usersDb) {
            if(user.getId().equals(signingInUser.getId()) && user.getPwd().equals(signingInUser.getPwd())) {
                System.out.println("id check, pwd check --> 로그인 성공");
                return true;
            }//db가 꽉 안차있으면 에러 발생 user를 읽지 못하고 null 이라고한다???
        }*/
        System.out.println("DB에 맞는 id와 pwd가 없습니다. \n회원가입 먼저 하세요~~~");
        return false;
    }
}
