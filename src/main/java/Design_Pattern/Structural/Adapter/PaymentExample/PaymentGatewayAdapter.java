package main.java.Design_Pattern.Structural.Adapter.PaymentExample;

import main.java.Design_Pattern.Structural.Adapter.PaymentExample.PaymentTypes.NewWayPayment;

public class PaymentGatewayAdapter extends PaymetGateway {

    NewWayPayment newWayPayment;

    public PaymentGatewayAdapter(NewWayPayment newWayPayment){
        this.newWayPayment= newWayPayment;
    }
    @Override
    public void payment(String FromCustomer, String toCustomer , String sum) {
        newWayPayment.makePay(FromCustomer,toCustomer,sum);
    }
}
