package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int count;
        int total = 0;
        HashMap <Integer, TreeSet> map = new HashMap();
        Lotto lotto = new Lotto();
        ArrayList<LottoDTO> list = new ArrayList();
        TreeSet winnerLotto = new TreeSet();

        //총 10개 lotto 번호 생성 (HashMap(String, lotto번호 TreeSet))
        while (total < 10) {
            System.out.println("구매할 로또 수량 선택 : ");
            count = scr.nextInt();

            for (int i = 0; i < count ; i++) {
                map.put((total+1), lotto.lottoCreator());
                total++;
            }
        }

        //key : int 로 오름차순 정렬
        //ArrayList (order : n번째, TreeSet)
        Iterator<Integer> keyIte = map.keySet().iterator();
        while (keyIte.hasNext()) {
            LottoDTO lottoDTO = new LottoDTO();
            int num = keyIte.next();
            lottoDTO.setOrder(num);
            lottoDTO.setLottoNum(map.get(num));
            list.add(lottoDTO);
        }

        //출력
        for (int i = 0; i < list.size(); i++) {

            System.out.println((list.get(i)).getOrder() + " 번 로또 : " + (list.get(i)).getLottoNum());
        }

        //당첨번호 생성
        winnerLotto = lotto.lottoCreator();
        System.out.println("당첨 번호 : " + winnerLotto);
        Object[] winArr = winnerLotto.toArray();

        //당첨 or NOT Check
        for (int i = 0; i < list.size(); i++) {
            Object[] lottoArr = ((list.get(i)).getLottoNum()).toArray();

            if (winArr.equals(lottoArr)) {
                System.out.println("로또 당첨!!!!!!! \n" + list.get(i).getOrder() + " 번 로또 : " + list.get(i).getLottoNum() + " 당첨!!! " );
            } else {
                System.out.println("이번 회차 당첨 없음");
            }


            /*for (int j = 0; j < lottoArr.length; j++) {
                if (lottoArr[j] == winArr[j]) {
                    continue;

                } else {
                    System.out.println("이번 회차 당첨 없음");
                    System.out.println("로또 당첨!!!!!!! \n" + list.get(i).getOrder() + " 번 로또 : " + list.get(i).getLottoNum() + " 당첨!!! " );
                    System.out.println("로또 번호 " + j + "개 당첨");
                }
            }*/


            /*Iterator<String> iter = hset.iterator();

            while (iter.hasNext()) {
                System.out.println(iter.next());
            }*/
            /*Iterator lottoIter = ((list.get(i)).getLottoNum()).iterator();
            while (lottoIter.hasNext()) {
                if (lottoIter.next())
            }*/

        }


        System.out.println(map);


    }
}
