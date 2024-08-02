package section05.typecasting;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 계산
        * 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산처리 된다.
        *
        * */

        int inum = 10;
        long lnum = 10L;
        long result = inum + lnum;
        int result2 = (int) (inum + lnum);
        int result3 = inum + (int)lnum;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        byte bnum = 1;
        short snum = 2;
        short result4 = (short) (bnum + snum);
        System.out.println(result4);
        // 대표자료형이 int 이기 때문에 int로 자동 형변환된 걸 한번 더 강제 형변환 해줘야 한다.
        long lnum3 = 3L;
        int result5 = (int)(snum + lnum3); // 더 큰거는 작은거에 담으려면 강제 형변환 필수


    }
}
