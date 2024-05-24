package main.java.Design_Pattern.Structural.Adapter.PaymentExample.PaymentTypes;

public interface Payment {
    public void makePay(String FromCustomer, String ToCustomer, String count);
}