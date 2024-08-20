package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int count = 0;
        int total = 0;
        int winNum;
        boolean win = false;
        HashMap <Integer, TreeSet> map = new HashMap();
        Lotto lotto = new Lotto();
        ArrayList<LottoDTO> list = new ArrayList();
        TreeSet winnerLotto = new TreeSet();

        //총 10개 lotto 번호 생성 (HashMap(String, lotto번호 TreeSet))
        while (total < 10) {
            System.out.println("구매할 로또 수량 선택 : ");
            count = scr.nextInt();
            if(count >10){
                System.out.println("한명의 사용자가 10개 이상을 구매할 수 없다.");
                continue;
            } else if ((total + count) >10) {
                System.out.println("10번 로또가 판매되면 로또 번호를 추첨 합니다. \n최대구매 수량" + (10-total) + "개 남았습니다.");
                continue;
            }

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

        System.out.println(map);

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
            winNum = 0;

            for (int j = 0; j < lottoArr.length; j++) {
                if (lottoArr[j] == winArr[j]) {
                    winNum++;
                }
            }
            if (winNum == 6) {
                System.out.println("로또 당첨!!!!!!! \n" + list.get(i).getOrder() + " 번 로또 : " + list.get(i).getLottoNum() + " 당첨!!! ");
                win = true;
            }
        }
        if (win == false) {
            System.out.println("이번 회차 당첨 없음");
        }


            /*if (winArr.equals(lottoArr)) {
                System.out.println("로또 당첨!!!!!!! \n" + list.get(i).getOrder() + " 번 로또 : " + list.get(i).getLottoNum() + " 당첨!!! " );
            } else {
                System.out.println("이번 회차 당첨 없음");
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
}
