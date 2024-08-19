package main.java.com.ohgiraffers.section02;

public class WildCardFarm {

    //매개변수로 전달받는 토끼농장을 구현할 때 사용할 타입 변수에 대해
    //제한할 수 있다.

    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }
    //RabbitFarm 이 가지는 타입을 모두 가질수 있는 메소드 (Rabbit, Bunny, DrunkenBunny)


    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }
    //Bunny 와 Bunny 를 상속받은 타입만 가질수 있는 메소드 (Bunny, DrunkenBunny)


    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }
    //Bunny 와 Bunny가 상속받는 타입만 가질 수 있는 메소드 (Bunny, Rabbit)

}
