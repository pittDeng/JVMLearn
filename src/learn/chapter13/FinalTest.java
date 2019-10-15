package learn.chapter13;

public class FinalTest {
    private final int value;
    //The field which has the attribute final must be assign a value in the constructor method.
    public FinalTest(int value){
        this.value=value;
    }
    public int other;
    public int getValue() {
        return value;
    }
    public static void main(String [] args){
        FinalTest ft=new FinalTest(2);
        System.out.println(ft.getValue());
        System.out.println(ft.other);
    }

}
