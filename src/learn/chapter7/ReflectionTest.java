package learn.chapter7;

import java.lang.reflect.Field;

public class ReflectionTest {
    public static void main(String [] args){
        Field [] fields=Double.class.getDeclaredFields();
        System.out.println(fields.length);
        for(Field fd:fields) {
            System.out.println(fd.toString());
        }
    }
}
