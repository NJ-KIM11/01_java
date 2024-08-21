package main.java.com.ohgiraffers.section03.uses;

public enum UserRole1 {

    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;
    //뒤에 기본 생성자를 붙일때만 ; 사용


    //Enum 은 상수 하나하나가 인스턴스화 된다.
    UserRole1(){
        System.out.println("기본 생성자 호출됨");   //enum 인스턴스의 갯수만큼 출력된다.
    }
    //enum 타입은 고정된 상수들의 집합으로, 런타임 시가 아닌 컴파일 시에
    // 모든 값이 결정되어 있어야 한다.
    // 생성자를 가질수는 있지만 private 이기 때문에 접근불가, 따라서 사용불가
    // 필요한 경우 메소드도 만들수 있다.
    public String getNameToLowerCase(){
        return this.name().toLowerCase();

    }
}
