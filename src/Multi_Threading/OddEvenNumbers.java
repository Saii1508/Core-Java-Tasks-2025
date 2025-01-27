package Multi_Threading;

import static java.lang.Thread.sleep;
//code of multi threading 
public class OddEvenNumbers {
    public static void main(String[] args) {
        Runnable oddNumbers = () -> {
            for(int i = 1; i<=10; i ++){
                if(i%2 != 0){
                    System.out.println(i + ": "+Thread.currentThread().getName());
                }
                try{
                    sleep(100);
                }catch (InterruptedException ie){
                    System.out.println(ie);
                }
            }
        };
        Runnable evenNumbers = () -> {
            for(int i = 1; i<=10; i ++){
                if(i%2 == 0){
                    System.out.println(i + ": "+ Thread.currentThread().getName());
                }
                try{
                    sleep(100);
                }catch (InterruptedException ie){
                    System.out.println(ie);
                }
            }        };
        Thread t1 = new Thread(oddNumbers);
        Thread t2 = new Thread(evenNumbers);
        t1.start();
        t2.start();
    }
}
