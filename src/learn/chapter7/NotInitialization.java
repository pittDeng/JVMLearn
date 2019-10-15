package learn.chapter7;

public class NotInitialization {
    public static void testSubAndSuperClass(){
        System.out.println(SubClass.value);
    }

    /**
     * print nothing
     */
    public static void testInitializeArray(){
        SuperClass [] sca=new SuperClass[10];
    }
    public static void testFinalConstant(){
        System.out.println(ConstClass.HELLOWORLD);
    }
    public static void main(String [] args){
        testFinalConstant();
    }
}
