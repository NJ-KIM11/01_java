package main.java.com.ohgiraffers.section06.ternary;

public class Question {
    public static void main(String[] args) {

        /*
        * 영어시험을 본 결과 1번 학생은 90점, 2번 학생은 95점, 3번 학생은 81점을 맞았다.
        * 평균을 구한 후 논리 연산자를 이용해 90~100점 이면 합격을 출력 아니면 불합격 출력
        * */

        int score1 = 90;
        int score2 = 95;
        int score3 = 81;
        int sum = score1 + score2 + score3;
        int average = sum / 3;
        System.out.println("1,2,3번 학생의 평균점수는 " + average + " 점이다.");
        String result1 = (score1 >= 90) ? "합격" : "불합격";
        String result2 = (score2 >= 90) ? "합격" : "불합격";
        String result3 = (score3 >= 90) ? "합격" : "불합격";
        System.out.println("1번 학생은 " + result1);
        System.out.println("2번 학생은 " + result2);
        System.out.println("3번 학생은 " + result3);

        /*
        * 승객의 놀이기구 탑승 가능여부를 출력하는 코드를 만들어 주세요.
        *탑승 기준은 120cm 이상.
        * */

        int height1 = 170;
        int height2 = 110;
        String reslut1 = (height1 >= 120) ? "탑승가능" : "탑승불가";
        String reslut2 = (height2 >= 120) ? "탑승가능" : "탑승불가";
        System.out.println("1번은 " + reslut1);
        System.out.println("2번은 " + reslut2);
    }
}
