package learn.chapter8;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MethodInvokingTest {
     class GrandFather{
        void thinking(){
            System.out.println("I am grandfather");
        }
    }
    class Father extends GrandFather{
        void thinking(){
            System.out.println("I am father");
        }
    }
     class Son extends Father{
        void thinking(){
            try{
                MethodType mt=MethodType.methodType(void.class);
                //MethodHandle mh=MethodHandles.lookup().findVirtual(GrandFather.class,"thinking",mt).bindTo(this);
                MethodHandle mh= MethodHandles.lookup().findSpecial(GrandFather.class,"thinking",mt,Father.class);
                mh.invoke(this);
            }catch (Throwable e){
                e.printStackTrace();
            }
//            try{
//                MethodType mt=MethodType.methodType(void.class);
//                Field IMPL_LOOKUP=MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");
//                IMPL_LOOKUP.setAccessible(true);
//                MethodHandles.Lookup lkp=(MethodHandles.Lookup)IMPL_LOOKUP.get(null);
//                MethodHandle h1=lkp.findSpecial(GrandFather.class,"thinking",mt,GrandFather.class);
//                h1.invoke(this);
//            }catch (Throwable e){
//                e.printStackTrace();
//            }
        }
    }
    public static void main(String [] args){
        new MethodInvokingTest().new Son().thinking();
    }
}
