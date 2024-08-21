package main.java.com.ohgiraffers.understand.chap03;

public class Customer {

    public String customerName;
    public String customerId;
    OrderItem orderItem = new OrderItem();


    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public void placeOrder(ProductDTO orderDTO , int orderProductQuantity){
        orderItem.setOrderItemPrice(orderDTO, orderProductQuantity);
        orderItem.orderListUp();

    }

    public void showOrderList(){
        System.out.println(orderItem.orderList);
        System.out.println("총 금액은 " + orderItem.getOrderSumPrice() + "원 입니다.");
    }

    public void showProductList(){

    }


}
