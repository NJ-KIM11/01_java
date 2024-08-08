package section01.literal;

public class Application02 {
    public static void main(String[] args) {

        // 정수 리터럴 연산 형식의 값을 연산 한다.

        /*
        *   123 + 123
        *   123 - 456
        *   123 * 456
        *   40 / 10
        *   10 % 2
        *
        **/

        System.out.println(123 + 123);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(40 / 10);
        System.out.println(10 % 2);

        System.out.println("----------------------");
        // 실수와 정수 연산  (실수는 정수보다 큰 개념으로 인식)
        //                     --> 실수는 정수가 될수 없지만 정수는 실수가 될수 있다
        //                     --> 실수와 정수의 연산의 결과값은 실수 로만 나온다
        System.out.println(1+0.5);
        System.out.println(1-0.5);
        System.out.println(1*0.5);
        System.out.println(1/0.5);
        System.out.println(1%0.5);
        System.out.println(0.5/1);

        System.out.println("----------------------");
        // 문자와 문자의 연산
        // 컴퓨터는 문자를 인식하지 못하기 때문에 대응되는 숫자들이 있다
        // (아스키코드(영어), 유니코드(전세계 언어))
        System.out.println('a'+'b');
        System.out.println("문자열" +'a'+'b');
        System.out.println("문자열" +('a'+'b'));
        System.out.println('ㄱ'+'ㄴ');

        //문자열은 + 연산만 가능하다.
        //데이터 값이 다를 때는 자동 형변환을 통해 최상위 타입으로 변경된다.
        //(문자열이 최상위 타입)

        System.out.println("------ 문자 열과 다른 형태의 값 연산 -----");
        System.out.println("he   llo       " + 1004);
        System.out.println("hello" + true);
        System.out.println("hello" +(123+456) +"world");

        System.out.println("-------------------------");
        //논리값 연산

        //System.out.println(true + 1);     불가능
        //System.out.println(true + false);     불가능
        System.out.println(true + "false");

//      Ctrl + /
//  /**/    Ctrl + shift + /





    }
}
