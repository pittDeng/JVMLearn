package learn.chapter8;

import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandleTest {
    static class ClassA{
        public void println(String s){
            System.out.println(s);
        }
    }
    public static void main(String [] args) throws Throwable {
        Object obj=System.currentTimeMillis()%2==0?System.out:new ClassA();
        System.out.println(obj.getClass().getName());
        if(obj instanceof ClassA){
            getPrintlnMH(obj).invokeExact("ClassA Hello world");
        }else if(obj instanceof PrintStream){
            getPrintlnMH(obj).invokeExact("System.out Hello world");
        }else{
            throw new Exception("some error has been occured");
        }

    }
    private static MethodHandle getPrintlnMH(Object receiver) throws NoSuchMethodException, IllegalAccessException {


        MethodType mt=MethodType.methodType(void.class,String.class);
        return MethodHandles.lookup().findVirtual(receiver.getClass(),"println",mt).bindTo(receiver);

    }
}
