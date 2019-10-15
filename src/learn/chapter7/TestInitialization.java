package learn.chapter7;


public class TestInitialization {

    static int i=1;
    static {
        i=0;
    }
    static {
        System.out.println(i);
    }
    public static void main(String [] args){
        new TestInitialization();
    }
}
