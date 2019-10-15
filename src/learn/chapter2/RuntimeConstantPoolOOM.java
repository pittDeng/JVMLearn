package learn.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Vm args: -XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class RuntimeConstantPoolOOM {
    public static void main(String [] args){
        List<String> list=new ArrayList<>();
        int i=0;
        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
