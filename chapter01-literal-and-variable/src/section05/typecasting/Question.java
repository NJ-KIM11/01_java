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
    }
}
