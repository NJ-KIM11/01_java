package section05.typecasting;

public class Question {
    public static void main(String[] args) {

        /*
        * 5명의 반 학생이 있으며 키는 각각
        * 178.5 / 170.3 / 190.7 / 188.67 / 160.8 이다.
        * 우리는 학생의 평균키를 구해서 화면에 보여주고자 한다.
        * 소수자리는 절삭한다.
        * */

        double height1 = 178.5;
        double height2 = 170.3;
        double height3 = 190.7;
        double height4 = 188.67;
        double height5 = 160.8;
        int studentNumber = 5;
        double sum = height1 + height2 + height3 + height4 + height5;
        System.out.println(sum);
        int average1 = (int)(sum / studentNumber);
        int average2 = (int)((height1 + height2 + height3 + height4 + height5) / studentNumber);
        int average3 = ((int)(sum))/studentNumber;
        System.out.println(average1);
        System.out.println(average2);
        System.out.println(average3);

        System.out.println("------------------------------------");

        /*
        * 사업을 시작한 홍길동은 이번 달 매출에서 부가세(10%)를 제외한 소득을 알고 싶다.
        *
        * 매출은 다음과 같다.
        * 150400원
        * 1400원
        * 25000원
        * 30000원
        *
        * 다음과 같이 출력 해주세요
        * 홍길동의 매출은 --원 입니다.
        * 부가세 제외 소득은 --원 이고 부가세는 --원 입니다.
        * */

        int earning = 150400 + 1400 + 25000 + 30000;
        double tax = 0.1;
        double hongTax = earning * tax;
        double income = earning - hongTax;
        System.out.println("홍길동의 매출은 " + earning +"원 입니다. \n");
        System.out.println("부가세 제외 소득은 " + (int)income + "원 이고 부가세는 " + (int)hongTax +"원 입니다.");


    }
}
