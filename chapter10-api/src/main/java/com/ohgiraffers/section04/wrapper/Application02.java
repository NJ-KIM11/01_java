package main.java.com.ohgiraffers.section04.wrapper;

public class Application02 {
    public static void main(String[] args) {

        //parsing : 문자열 값을 기본자료형으로 변경하는것

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");
//        long l = Long.parseLong("8L");
        float f = Float.parseFloat("4.0f");
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");
//        System.out.println(l);
    }
}
