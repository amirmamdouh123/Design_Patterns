package main.java.Design_Pattern;

public class RaceCondition implements Runnable{

   volatile int count =0;

    @Override
    public void run() {
        for(int i=0;i<5;i++){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println(count);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
