package main.java.Design_Pattern.Structural.Adapter.PaymentExample.PaymentTypes;

public class OldWayPayment implements Payment {
    

    public void makePay(String count , String from, String to){
        //old pay process
        System.out.println("From: "+from+" To: "+to+" count:"+count);
    }
}
