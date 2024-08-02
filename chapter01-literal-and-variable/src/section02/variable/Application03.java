package section02.variable;

public class Application03 {
    public static void main(String[] args) {

        /*
        *  변수의 명명 규칙
        *  변수의 이름을 지을 때 아무렇게나 짓는 것이 아니라 정해진 규칙이 있다.
        *  실무적으로 굉장히 중요하기 때문에 반드시 숙지해야 한다.
        *  또한 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍의 첫 단추이다.
        * */

        /*
        * 1. 컴파일 에러를 발생시키는 규칙
        * 1-1. 동일한 범위 내에세는 동일한 변수명을 가질 수 없다.
        * 1-2. 예약어는 사용이 불가능하다.(미리 프로그램에서 사용하겠다고 약속한 키워드)
        * 1-3. 변수명은 대/소문자를 구분한다.(자바는 대소문자를 엄격하게 구분하는 언어이다.)
        * 1-4. 변수명은 숫자로 시작할 수 없다. (시작하는 것만 불가능하고 섞어서 사용하는 것은 가능하다.)
        * 1-5. 특수기호는 '_' 와 '$' 만 사용 가능하다.
        * */

        // 동일한 범위 내에서는 동일한 변수명을 가질 수 없다.
        int age = 20;
        // int age = 10; (불가능)

        // 예약어는 사용이 불가능하다.
        // int true = 10;
        // int for = 5;

        // 변수명은 대소문자를 구분한다.
        int Age = 20;
        int True = 10;

        // 변수명은 숫자로 시작할 수 없다.
        // int 1test = 10; (불가능)
        int t1e1s1t1 = 10;

        // 특수기호는 '_' 와 '$' 만 사용이 가능하다.
        int _a_g_e_ = 10;
        int $te$s$t$ = 20;
        // int #test = 30; (불가능)

        /*
        * 2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙
        * 2-1. 변수명의 길이 제한은 없다. (하지만 적당히)
        * 2-2. 변수명이 합성어로 이루어진 경우 첫단어는 소문자, 두번째 단어는 대문자로 한다.(camel-case)
        * 2-3. 단어와 단어 사이의 연결은 언더스코어(_)로 하지 않는다.(타 언어 규칙)
        * 2-4. 한글로 변수명을 짓는 것은 가능하지만 권장하지 않는다.
        * 2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 명확히 표현되도록 한다.
        * 2-6. 전형적인 변수 이름이 있다면 가급적 사용한다.
        * 2-7. 명사형으로 작성할 수 있도록 한다.
        * 2-8. boolean 형은 의문문으로 가급적 긍정형으로 네이밍 한다.
        * */

        // 변수명의 길이 제한은 없다.
        int qadsdasnmniandfdsfaklsdnflkdnfwifnwienf; //적당히하자

        // 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두번째 단어 첫글자는 대문자.
        int maxAge = 10;
        int MaxAge = 10; //안하는게 좋다(클래스만 첫글자를 대문자로 한다)

        // 단어와 단어 사이의 연결은 언더스코어로 하지 않는다.
        String user_name; //스네이크 케이스(타 언어 규칙)
        String userName;

        // 한글로 변수명을 짓는 것은 가능하지만 권장하지 않는다.
        int 나이;

        // 변수안에 저장된 값이 어떤 의미를 가지는지 명확하게 표기하도록 한다.
        String s;
        String name;

        // 전형적으로 변수 이름이 있다면 가급적 사용한다.
        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 0;

        // 명사형으로 작성할 수 있도록 한다.
        String goHome; //가능
        String home; //되도록 권장

        // boolean 형은 가급적 긍정형태로 작성한다.
        boolean isAlive = true; //권장
        boolean isDead = false; //비권장


    }
}
