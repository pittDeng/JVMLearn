package learn.chapter12;

public class ThreadWaitTest {
    public static void main(String [] args){
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (ThreadWaitTest.class){
                    try {
                        ThreadWaitTest.class.wait(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Hello World");
                }
            }
        });
        th1.start();
        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (ThreadWaitTest.class){
                    System.out.println("I will notify some printing");
                    ThreadWaitTest.class.notify();
                    System.out.println("After notify");
                }
            }
        });
        th2.start();
    }
}
