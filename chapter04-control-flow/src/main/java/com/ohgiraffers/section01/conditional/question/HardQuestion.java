package main.java.com.ohgiraffers.section01.conditional.question;


public class HardQuestion {
    public static void main(String[] args) {

        // -------------------------- 심화 문제---------------- 못푼다고 걱정하지 말자
              /*  피보나치 수열(An = An-1 + An-2)을 화면에 출력해라.
              (첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열)
        1. 결과값: 1 1 2 3 5 8 13 21 34
        2. for문과 배열을 이용해 코드를 간소화하여 작성해야 한다.
        3. 9개 까지 출력한다.*/

        int[] pibonachiArray = new int[9];
        pibonachiArray[0] = 1;
        pibonachiArray[1] = 1;
        for (int i = 2; i < 9; i++){

            pibonachiArray[i] = pibonachiArray[i-1] + pibonachiArray[i-2];
            System.out.println(pibonachiArray[i]);
        }

        System.out.println(pibonachiArray);


    }
}
