package main.java.com.ohgiraffers.section02.string;

import java.util.StringTokenizer;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 문자열 분리
        * - 문자열을 특정 구분자로 분리한 문자열을 반환하는 기능
        *
        * split() : 정규표현식을 이용하여 문자열을 분리한다.
        * 비정형화된 문자열을 분리할 때 좋지만
        * 정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
        * 정규표현식은 자바에서는 다루지 않고 자바스크립트에서 다룰 예정
        * StringTokenizer: 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
        * 정형화된 문자열 패턴을 분리할 때 사용하기 좋다.
        * split 보다 속도면에서 더 빠르다.
        *
        * */

        String emp1 = "100/홍길동/서울/영업부"; //모든값존재
        String emp2 = "200/유관순//총무부"; //주소없음
        String emp3 = "300/이순신/경기도/"; //부서없음

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        for (int i = 0; i < empArr1.length; i++) {
            System.out.println("empArr1[" + i + "] = " + empArr1[i]);
        }
        for (int i = 0; i < empArr2.length; i++) {
            System.out.println("empArr2[" + i + "] = " + empArr2[i]);
        }
        for (int i = 0; i < empArr3.length; i++) {
            System.out.println("empArr3[" + i + "] = " + empArr3[i]);
        }
        //중간공백은 인식, 마지막 공백은 표현 불가

        String[] empArr4 = emp3.split("/",-1);
        //두번째 전달인자는 쪼개는 갯수, 음수일시는 최대로 쪼개기
        for (int i = 0; i < empArr4.length; i++) {
            System.out.println("empArr4[" + i + "] = " + empArr4[i]);
        }

        StringTokenizer st1 = new StringTokenizer(emp1,"/");
        StringTokenizer st2 = new StringTokenizer(emp2,"/");
        StringTokenizer st3 = new StringTokenizer(emp3,"/");

        while (st1.hasMoreTokens()) {
            System.out.println("st1 :" + st1.nextToken());
        }
        while (st2.hasMoreTokens()) {
            System.out.println("st2 :" + st2.nextToken());
        }
        while (st3.hasMoreTokens()) {
            System.out.println("st3 :" + st3.nextToken());
        }

        String colorStr = "red*orange#blue/yellow green";
//        String[] colors = colorStr.split("*#/ ");

        StringTokenizer colorStrTokenizer = new StringTokenizer(colorStr,"*#/ ");
        while (colorStrTokenizer.hasMoreTokens()) {
            System.out.println("colorStrTokenizer.nextToken() :" + colorStrTokenizer.nextToken());
        }
    }
}
