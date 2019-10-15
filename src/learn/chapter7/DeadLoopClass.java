package learn.chapter7;

public class DeadLoopClass {
    static {
            if(true){
                System.out.println(Thread.currentThread()+"init DeadLoopClass");
            }
    }

}
