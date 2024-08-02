package section02.variable;

public class Question {
    public static void main(String[] args) {


        /*
        * 김경리가 4명의 직원의 월급을 입금해줘야 하는 날이다.
        * 각각 직책은 대리/ 과장/ 차장/ 부장 이며,
        * 대리는 100만원, 과장은 120만원, 차장은 130만원, 부장은 150만원의 월급을 받는다.
        * 보너스는 각 월급 * 0.5 만큼을 주어야 한다.
        *
        * 화면에 다음과 같이 출력되게 해주세요
        * ex)김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입금 되었습니다.
        * 4명 다 출력
        * */

        int salary1 = 100;
        int salary2 = 120;
        int salary3 = 130;
        int salary4 = 150;
        int bonus1 = (int)(salary1 * 0.5);
        int bonus2 = (int)(salary2 * 0.5);
        int bonus3 = (int)(salary3 * 0.5);
        int bonus4 = (int)(salary4 * 0.5);
        int sum1 = bonus1 + salary1;
        int sum2 = bonus2 + salary2;
        int sum3 = bonus3 + salary3;
        int sum4 = bonus4 + salary4;

        System.out.println("김대리의 월급은 " + salary1 + "만원 + 보너스 " + bonus1 + "만원으로 총 " + sum1 +"만원 입금 되었습니다.");
        System.out.println("박과장의 월급은 " + salary2 + "만원 + 보너스 " + bonus2 + "만원으로 총 " + sum2 +"만원 입금 되었습니다.");
        System.out.println("이차장의 월급은 " + salary3 + "만원 + 보너스 " + bonus3 + "만원으로 총 " + sum3 +"만원 입금 되었습니다.");
        System.out.println("최부장의 월급은 " + salary4 + "만원 + 보너스 " + bonus4 + "만원으로 총 " + sum4 +"만원 입금 되었습니다.");



    }
}
