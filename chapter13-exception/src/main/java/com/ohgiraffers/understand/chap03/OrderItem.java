package main.java.com.ohgiraffers.understand.chap03;

public class OrderItem {

    String orderItemName;
    int orderItemQuantity;
    int orderItemPrice;

    public int getOrderItemPrice(ProductDTO orderDTO, int orderItemQuantity) {
        this.orderItemName = orderDTO.getProductName();
        this.orderItemQuantity = orderItemQuantity;
        this.orderItemPrice = (orderDTO.getProductPrice() * orderItemQuantity);
        return orderItemPrice;
    }



}
