package learn.chapter13;


import learn.chapter12.ThreadWaitTest;

import java.util.Vector;

public class VectorConcurrentTest {
    public static void main(String []args) throws InterruptedException {
        Vector<Integer> vector=new Vector<>();
        for(int i=0;i<10;++i){
            vector.add(i);
        }
        Thread delete=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<vector.size();){
                    vector.remove(0);
                }
            }
        });
        Thread print=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<vector.size();++i){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(vector.get(i));
                }
            }
        });
        delete.start();
        print.start();
        delete.join();
        print.join();
        System.out.println(vector.size());
    }
}
