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
        } else {
            System.out.println("회원 정원 초과");
            return false;
        }
        return true;
    }

    public boolean loginCheck(String id, String pwd) {
        if (usersDb[0] == null){
            System.out.println("가입된 회원이 없습니다.");
            return false;
        }
        for(User user : usersDb) {
            if(user.getId().equals(id) && user.getPwd().equals(pwd)) {
                System.out.println("id check, pwd check --> 로그인 성공");
                return true;
            }
        }
        System.out.println("DB에 맞는 id와 pwd가 없습니다. \n회원가입 먼저 하세요~~~");
        return false;
    }
}
