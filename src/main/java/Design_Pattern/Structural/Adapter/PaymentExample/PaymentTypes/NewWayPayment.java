package main.java.Design_Pattern.Structural.Adapter.PaymentExample.PaymentTypes;

public class NewWayPayment  implements Payment {

    @Override
    public void makePay(String FromCustomer , String ToCustomer ,String count){
        //new  pay process
        System.out.println("New Pay... From: "+FromCustomer+"To: "+ToCustomer+" count:"+count);
    }

}
