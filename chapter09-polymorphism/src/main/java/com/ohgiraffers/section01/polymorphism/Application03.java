package main.java.com.ohgiraffers.section01.polymorphism;

public class Application03 {
    public static void main(String[] args) {

        //다형성을 적용하여 매개변수에 활용
        Animal animal = new Rabbit();
        Animal animal1 = new Tiger();

        Application03 app3 = new Application03();

        app3.feed(animal);
        app3.feed(animal1);

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        app3.feed(rabbit);
        app3.feed(tiger);
        //feed 메소드의 매개변수 자료형에 일치한다 (자식은 부모의 자료형도 갖기 때문에)

        app3.feed(new Tiger());
        app3.feed(new Rabbit());
        //method 매개변수로 바로 객체 생성도 가능


    }

    //Animal 자료형을 매개변수로 갖는 feed 메소드
    public void feed(Animal animal){
        animal.eat();
    }
}
