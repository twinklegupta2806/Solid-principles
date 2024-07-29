package yagni.principle;

import java.util.Objects;

public class PaymentProcessorWithYagni
{
    public void makePayment(String paymentMethod){
        if(Objects.equals(paymentMethod, "credit card")){
            System.out.println("credit cardddddd");
        }
    }
}
