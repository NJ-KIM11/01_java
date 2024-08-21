package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;

public class OrderItem {

    String orderItemName;   //주문된 제품 이름
    int orderItemQuantity;  //주문수량
    int orderItemPrice;     //주문 총 가격 = 수량 * 가격

    ArrayList<OrderItem> orderList = new ArrayList<OrderItem>();

    public void orderListUp(){
        orderList.add(new OrderItem(orderItemName, orderItemQuantity, orderItemPrice));
    }

    public int getOrderSumPrice(){
        int orderSumPrice = 0;  //총 주문 금액
        for(OrderItem orderItem : orderList){
            System.out.println("주문 표 : " + orderItem.getOrderItemName() + " : " + orderItem.getOrderItemQuantity()
                     + "개 = " + orderItem.orderItemPrice);
            orderSumPrice += orderItem.orderItemPrice;
        }
        return orderSumPrice;
    }

    public void setOrderItemPrice(ProductDTO orderDTO, int orderItemQuantity) {
        this.orderItemName = orderDTO.getProductName();
        this.orderItemQuantity = orderItemQuantity;
        this.orderItemPrice = (orderDTO.getProductPrice() * orderItemQuantity);
        System.out.println("주문 표 : " + this.orderItemName + " : " + orderDTO.getProductPrice() + "원 *"
                + this.orderItemQuantity + "개 = " + this.orderItemPrice);

    }


    public OrderItem() {
    }

    public OrderItem(String orderItemName, int orderItemQuantity, int orderItemPrice) {
        this.orderItemName = orderItemName;
        this.orderItemQuantity = orderItemQuantity;
        this.orderItemPrice = orderItemPrice;
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public int getOrderItemQuantity() {
        return orderItemQuantity;
    }

    public int getOrderItemPrice() {
        return orderItemPrice;
    }



    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemName='" + orderItemName + '\'' +
                ", orderItemQuantity=" + orderItemQuantity +
                ", orderItemPrice=" + orderItemPrice +
                "}\n";
    }
}
