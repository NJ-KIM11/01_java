package main.java.com.ohgiraffers.section06.parameter;

public class ParameterTest {

    public void TestPrimaryTypeParameter(int num){
        System.out.println("매개변수로 전달 받은 값 : " + num);
    }

    public void TestPrimaryTypeArrayParameter(int[] iarr){
        System.out.println("매개변수로 전달 받은 값 : " + iarr);

        System.out.println("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        iarr[0] = 99;
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassTypeParameter(Rectangle rectangle){
        /*
        * 인스턴스도 주소가 전달된다.
        * 즉, 인자로 전달하는 인스턴스와 매개변수로 전달 받은 인스턴스는
        * 서로 동일한 인스턴스를 가리킨다. (얕은 복사)
        * */
        System.out.println("매개변수로 전달받은 값 : " + rectangle);
        System.out.println("변경전 사각형의 넓이와 둘레 =====");
        rectangle.calcArea();
        rectangle.calcRound();
        System.out.println("변경후 사각형의 넓이와 둘레 =====");
        rectangle.setHeight(100);
        rectangle.setWidth(100);
        rectangle.calcArea();
        rectangle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name, String... hobby){

        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for (String hobbys:hobby){
            System.out.print(hobbys+" ");
        }
        System.out.println();
    }
}
