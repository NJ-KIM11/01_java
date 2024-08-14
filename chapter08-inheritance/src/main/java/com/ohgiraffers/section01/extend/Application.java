package main.java.com.ohgiraffers.section01.extend;

import java.lang.module.FindException;

public class Application {
    public static void main(String[] args) {

        /*
        * 상속
        * : 상속은 현실 세계의 상속과 비슷한 개념이다.
        * 부모가 가지고 있는 재산(자바에서는 멤버)를 자식이 물려받는 의미이다.
        * 클래스 또한 부모 클래스와 자식 클래스로 역할을 나누어서 부모가 가지는
        * 멤버를 자식이 물려받아 자기의 멤버인 것처럼 사용할 수 있도록 만든 기술이다.
        *
        * 하지만 단순 물려받는 개념 보다는 조금 더 나아가서
        * 자바에서 상속은 부모클래스의 확장의 개념을 가진다.
        * 물려받아 자신의 것처럼 사용하는 것 뿐만 아니라
        * 추가적인 멤버도 작성이 가능하다.
        * 특히 메소드 재정의(overriding) 이라는 기술을 이용해서
        * 부모가 가진 메소드를 재정의 하는 것도 가능하다.
        *
        *
        * 상속이라는 기술을 사용하게 되면 얻게 되는 이점
        * 1. 새로운 클래스를 작성할 시 기존에 작성한 클래스를 재사용할 수 있다.
        *   1-1. 재사용시 생산성을 크게 향상시킬 수 있다.
        *   1-2. 공통적으로 사용하는 코드가 부모 클래스에서만 존재하면 수정사항이
        * 생길 시 부모만 수정해도 전체적으로 적용된다. (유지보수성 증가)
        * 2. 클래스 간의 계층 관계가 형성되며 다형성 문법적인 토대가 된다.
        *
        * 하지만 단점도 존재한다.
        * 1. 부모 클래스의 기능을 추가/변경할시 자식클래스가 정상적으로 동작하는지 예측이 힘들다.
        * 상속 구조가 복잡해 질수록 그 영향에 대한 예측이 힘들어 이러한
        * 단점이 유지보수성이 증가하는 장점과는 반대로 유지보수에 악영향을 끼친다.
        * 2. 또한 부모클래스의 변경도 쉽지 않다. 자식 클래스에서 중요하게 사용하는 기능인 경우
        * 부모 클래스를 변경할시 자식 클래스에 모두 영향을 줄 수 있다.
        * 역시 유지보수성에 악영향을 미친다.
        * 3. 부모 클래스에서는 의미 있었던 기능이 자식 클래스에서는 무의미할 수 있다.
        *
        * 장점과 단점을 고려했을 때
        * 상속은 재사용이라는 장점만 바라보게 되면 오용 가능성이 있기 때문에
        * 유지보수에 좋지 않은 코드를 작성할 확률이 높다.
        * 상속은 IS-A 관계로 구분이 되는 경우에만 사용해야 한다.
        * (사람은 동물이다, 개는 동물이다. -> 동물은 사람이다?)
        *
        * */

        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();
        System.out.println("---------------------------");

        Firecar firecar = new Firecar();
        System.out.println(firecar.toString());
        firecar.run();
        firecar.soundHorn();
        //상속은 확장이다.
        firecar.sprayWater();
        System.out.println("---------------------------");

        Car test = firecar; //자식을 부모에게 넣어준다.
        test.run();
        test.soundHorn();   //자식이 재정의한 매소드가 실행된다.
//        test.sprayWater();  //자식이 확장해서 새로 만든 메소드는 찾지 못한다.

//        Firecar test2 = car;      //자식은 부모의 대체가 가능하지만 부모는 자식을 대체할 수 없다.

        System.out.println("레이싱 카 테스트");
        RacingCar racingCar = new RacingCar();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();

//        Firecar firecar1 = racingCar;   //자식끼리는 대체불가

    }
}
