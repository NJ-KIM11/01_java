package main.java.com.ohgiraffers.section02;

public abstract class Product {

    private int nonStaticField;
    private static int staticField;
    //static, nonstatic 필드 선언 가능

    public Product(){}
    //기본 생성자 선언 가능

    public void nonStaticMethod(){
        System.out.println("Product 클래스의 nonStaticMethod 를 호출함");
    }
    public static void staticMethod(){
        System.out.println("Product 클래스의 staticMethod 를 호출함");
    }
    public abstract void abstractMethod();

}
