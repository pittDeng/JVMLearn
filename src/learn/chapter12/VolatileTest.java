package learn.chapter12;

public class VolatileTest {
    public static volatile int race=0;
    public static void increase(){
        race++;
    }
    private static final int THREAD_COUNT=20;
    public static void main(String[]args) throws InterruptedException {
        Thread [] threads=new Thread[THREAD_COUNT];
        for(int i=0;i<THREAD_COUNT;++i){
           threads[i]=new Thread(new Runnable() {
               @Override
               public void run() {
                   for(int i=0;i<1000;i++){
                       increase();
                       //System.out.println(race);
                   }
               }
           }) ;
           threads[i].start();
        }
        for(int i=0;i<THREAD_COUNT;++i)
            threads[i].join();
        System.out.println(race);
    }
}
