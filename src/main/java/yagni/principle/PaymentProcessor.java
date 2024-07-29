package yagni.principle;

import java.util.Objects;

public class PaymentProcessor
{
    public void makePayment(String paymentMethod){
        if(Objects.equals(paymentMethod, "credit card")){
            System.out.println("credit cardddddd");
        } else if(Objects.equals(paymentMethod, "bitcoin")){
            System.out.println("bitcoinnnnnn");
        } else if(Objects.equals(paymentMethod, "paypal")){
            System.out.println("paypal payment");
        }
    }
}
