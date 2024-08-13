package main.java.com.ohgiraffers.section06.parameter;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calcArea(){
        double area = width * height;
        System.out.println("사각형의 넓이는 : " + area);
    }
    public void calcRound(){
        double round = (width + height) * 2;
        System.out.println("사각형의 둘레는 : " + round);
    }

    @Override       //부모가 가지고 있는 메소드를 재정의해서 자식이 사용(override)
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
