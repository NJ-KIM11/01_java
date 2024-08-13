package main.java.com.ohgiraffers.section01.extend;

public class Firecar extends Car{
    public Firecar() {
        super();        //생략해도 된다. 항상 자동으로 추가되어 있다.
    }

    @Override
    public void soundHorn() {   //접근제어자와 반환타입은 반드시 부모 클래스의 그것과 일치 시켜 주어야 한다.
        if(isRunning()){
            System.out.println("빠아아아아아아아아아앙");
        }else {
            System.out.println("소방차가 멈춰있습니다");
        }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }
}
