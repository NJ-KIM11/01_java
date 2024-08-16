# 결제 프로그램

사용자가 다양한 결제 방식을 통해 온라인 쇼핑몰에서 결제를 수행할 수 있는 시스템을 구현하는 문제.<br>
각 결제 방식은 인터페이스를 통해 동적 바인딩을 사용하여 구현되며,<br>
사용자가 선택한 결제 수단에 따라 결제가 이루어짐.

PaymentDTO 클래스

사용자가 결제를 하기 위한 정보를 담는 클래스입니다. 카드번호, 유효기간, CVC, 결제금액 등의 정보를 포함.

PaymentService 클래스

PaymentInfoDTO 클래스를 매개변수로 받고, 사용자가 입력한 결제 정보가 유효한지 확인.
이 클래스는 processPayment() 메서드를 통해 결제 처리를 수행.

PaymentMethod 인터페이스

processPayment() 메서드를 제공하며, 이를 구현하는 클래스들은 다양한 결제 방식을 처리.

구현할 결제 방식 클래스

아래의 클래스들은 PaymentMethod 인터페이스를 상속받아 구현.

1. 신용카드 결제 (CreditCardPayment)
2. PayPal 결제 (PayPalPayment)
3. 비트코인 결제 (BitcoinPayment)

## 프로그램 동작
main 메서드에서 사용자가 결제 방식을 선택한다.<br>
결제 방식이 결정되면 사용자에게 결제 정보를 입력받는다.<br>
입력받은 결제 방식에 따라 결제가 처리된다.

출력 화면 예시

유효하지 않은 결제 정보의 경우: "결제가 실패했습니다. 다시 시도해 주세요." <br>
유효한 결제 정보의 경우: "결제가 성공적으로 완료되었습니다."

### 클래스
1. Application
2. PaymentDTO
3. PaymentService
4. PaymentMethod
   1. CreditCardPayment
   2. PayPalPayment
   3. BitcoinPayment