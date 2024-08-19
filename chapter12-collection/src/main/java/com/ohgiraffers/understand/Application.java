package main.java.com.ohgiraffers.understand;

import java.util.HashMap;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int count;
        int total = 0;
        HashMap map = new HashMap();
        Lotto lotto = new Lotto();

        //총 10개 lotto 번호 생성(HashMap(String, lotto번호 TreeSet))
        while (total < 10) {
            System.out.println("구매할 로또 수량 선택 : ");
            count = scr.nextInt();

            for (int i = 0; i < count ; i++) {
                map.put(((total+1) + "번 로또"), lotto.lottoCreator());
                total++;
            }

        }

        //
        System.out.println(map);


    }
}
