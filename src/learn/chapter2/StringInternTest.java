package learn.chapter2;

public class StringInternTest {
    public static void main(String [] args){
        String str1=new StringBuilder("计算机").append("软件").toString();
        //Since jdk1.7, {String.intern()} return the object itself if the value of the string is first appeared on the constant pool
        //return the reference of the constant in constant pool otherwise.
        System.out.println(str1.intern()==str1);//true
        String str2=new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern()==str2);//false
    }
}
