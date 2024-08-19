package main.java.com.ohgiraffers.section02.run;

import main.java.com.ohgiraffers.section02.Bunny;
import main.java.com.ohgiraffers.section02.DrunkenBunny;
import main.java.com.ohgiraffers.section02.Rabbit;
import main.java.com.ohgiraffers.section02.RabbitFarm;

public class Application {
    public static void main(String[] args) {

        /*
        * 제네릭 클래스 작성 시 extends 키워드를 사용하면
        * 특정 타입만 사용하도록 제한을 걸 수 있다.
        * */

//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
        //extends Rabbit 이기 때문에 불가
//        RabbitFarm<Mammal> farm1 = new RabbitFarm<Mammal>();
//        RabbitFarm<Snake> farm1 = new RabbitFarm<Snake>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();

    }
}
