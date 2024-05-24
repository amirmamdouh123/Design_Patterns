package main.java.Design_Pattern;

import main.java.Design_Pattern.Structural.Adapter.PaymentExample.PaymentTypes.NewWayPayment;
import main.java.Design_Pattern.Structural.Adapter.PaymentExample.PaymentGatewayAdapter;

public class HelloApplication {


    public static void main(String[] args) {

        NewWayPayment newPay=new NewWayPayment();


        PaymentGatewayAdapter paymentAdapter=new PaymentGatewayAdapter(newPay);

        paymentAdapter.payment("amir","mamdouh","1000");








//        Cloneclass c1=new Cloneclass();
//        c1.setName("Amir");
//        c1.setPassword("1234");
//
//        Cloneclass c2=c1.clone();
//        c2.setName("new Name");
//        System.out.println(c2.getName());
//        System.out.println(c1.getName());
//
//






//        Company company=new Company();
//        Component AsuGpu=company.CreateGpu("asu");
//        Component MsiMonitor=company.CreateMonitor("msi");
//
//        System.out.println(AsuGpu.assemble());
//        System.out.println(MsiMonitor.assemble());

//        User user= User.builder("amir","mamdouh").setEmail("amir@gmail.com").build();
//        System.out.println(user);
//        OverallRestaurant restaurant=new OverallRestaurant();
////        BurgerTypes type=BurgerTypes.BEFF;
//        Burger burger=restaurant.createOrder("BEFF");
//        System.out.println(burger);

//        RaceCondition x =new RaceCondition();
//
//        Thread t1= new Thread(x);
//        t1.start();
//
//        Thread t2= new Thread(x);
//        t2.start();
//
//        t1.join(); //main thread wait until t1 finish
//        t2.join(); //main thread wait until t2 finish
//
//        System.out.println("the Main thread is finished with "+x.getCount());

    }
}