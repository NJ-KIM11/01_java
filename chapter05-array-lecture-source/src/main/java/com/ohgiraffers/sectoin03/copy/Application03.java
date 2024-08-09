package main.java.com.ohgiraffers.sectoin03.copy;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 깊은 복사
        * heap 에 생성된 배열이 가지고 있는 값을 또 다른 배열에 복사하는 것.
        *
        * 서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
        * 하나의 배열을 변경 하더라도 다른 배열에는 영향을 주지 않는다.
        * */

        /*
        * 깊은 복사를 하는 방법 4가지
        * 1. for 문을 이용한 동일 인덱스 값 복사
        * 2. object 의 clone 을 이용한 복사
        * 3. System 의 arraycopy() 를 이용한 복사
        * 4. Array 의 copyOf() 를 이용한 복사
        * */

        int[] originArr = {1,2,3,4,5};
        print(originArr);

        //1. for 문을 이용한 동일 인덱스 값 복사
        int[] copyArr1 = new int[10];
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }

        print(copyArr1);

        //2. Object 의 clone() 을 이용한 복사
        System.out.println("object clone : ");
        int[] copyArr2 = originArr.clone();
        print(copyArr2);

        //3. System 의 arraycopy() 를 이용한 복사
        System.out.println("arraycopy : ");
        int[] copyArr3 = new int[10];
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
        //(복사할 배열, 복사할 배열의 복사시작 인덱스, 복사받을 배열(복사한 값을 넣을 배열), 복사받을 배열의 시작 인덱스, 복사할 배열의 복사끝 인덱스)
        print(copyArr3);

        //4. Array 의 copyOf() 를 이용한 복사
        System.out.println("copyOf : ");
        int[] copyArr4 = Arrays.copyOf(originArr, originArr.length);
        //(복사할 배열, 복사받을 배열의 길이)
        //복사받을 배열의 길이가 복사할 배열의 길이보다 더 길면 알아서 그만큼 늘어나고 값은 0으로 초기화 된다.
        print(copyArr4);

    }

    public static void print(int[] iarr) {
        System.out.println("iarr.hashcode = " + iarr.hashCode());

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }
}
