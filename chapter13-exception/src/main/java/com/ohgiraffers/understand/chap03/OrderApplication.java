package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderApplication {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Customer customer = new Customer();
        int choice;
        String orderProductName;
        int orderQuantity;

        //제품 목록을 리스트로 미리 생성
        ArrayList<ProductDTO> productArrList = new ArrayList<>();
        productArrList.add(new ProductDTO("TV", 5000, 10));
        productArrList.add(new ProductDTO("신발", 1000, 20));
        productArrList.add(new ProductDTO("자전거", 3000, 5));

        System.out.println("============회원 생성=============");
        System.out.println("고객 이름 입력 : ");
        customer.customerName = scr.nextLine();
        System.out.println("id 입력 : ");
        customer.customerId = scr.nextLine();
        System.out.println(customer + "회원 생성 완료");

        loop : while(true){
            System.out.println("============주문 관리 시스템=============");
            System.out.println("1. 제품 목록 조회");
            System.out.println("2. 제품 주문");
            System.out.println("3. 주문 내역 조회");
            System.out.println("9. 프로그램 종료");
            choice = scr.nextInt();
            scr.nextLine();

            sloop : switch(choice){
                case 1:
                    System.out.println(productArrList);break;

                case 2 :
                    System.out.println("주문할 제품 이름 :");
                    orderProductName = scr.nextLine();
                    System.out.println("주문할 수량 : ");
                    orderQuantity = scr.nextInt();
                    scr.nextLine();
                    for(ProductDTO product : productArrList){
                        if(product.getProductName().equals(orderProductName)) {
                            customer.placeOrder(product, orderQuantity); break sloop;
                        }
                    }
                    System.out.println("제품 목록에 없는 제품 입니다.");
                    break;

                case 3 :
                    customer.showOrderList();
                    break;

                case 9 : break loop;

                default:
                    System.out.println("잘못된 번호 선택입니다.");

            }

        }

    }
}
