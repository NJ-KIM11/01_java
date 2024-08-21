package main.java.com.ohgiraffers.section03.uses;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {

        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer = UserRole2.CONSUMER;
        System.out.println(consumer.name() + " " + consumer.getDescription());

        UserRole2 producer = UserRole2.PRODUCER;
        System.out.println(producer.name() + " " + producer.getDescription());

        //인스턴스는 싱글톤으로 관리되기 때문에 동일비교 연산이 가능하다.
        System.out.println(consumer == (UserRole2.CONSUMER));
        System.out.println(consumer.name().equals("consumer"));

        System.out.println("=======================================");

        //EnumSet 을 활용하여 여러 열거형 타입들을 set으로 취급할 수 있다.
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().name());
        }

        //특정 타입만 골라서 set에 추가할수 있다.
        EnumSet<UserRole2> users = EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER);
        Iterator<UserRole2> userIter = users.iterator();
        while (userIter.hasNext()) {
            UserRole2 role = userIter.next();
            System.out.println(role.name() + " " + role.getDescription());
        }

    }
}
