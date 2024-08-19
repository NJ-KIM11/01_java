package main.java.com.ohgiraffers.section02;

public class RabbitFarm<T extends Rabbit >{
    //Rabbit 을 포함해서 Rabbit의 자손들만 쓸수 있다
    //extends 만 사용가능 implements 사용불가
    //interface 상속필요시 extends 인터페이스 클래스 또는 extends 추상클래스 & 인터페이스 클래스

    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
