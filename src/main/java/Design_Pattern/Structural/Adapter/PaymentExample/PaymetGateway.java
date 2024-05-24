package main.java.Design_Pattern.Structural.Adapter.PaymentExample;

import main.java.Design_Pattern.Structural.Adapter.PaymentExample.PaymentTypes.OldWayPayment;

public class PaymetGateway {

    OldWayPayment oldWayPayment=new OldWayPayment();

    public void payment(String FromCustomer,String ToCustomer , String count ){
        //old payment
        oldWayPayment.makePay(count,FromCustomer,ToCustomer);
    }
}
