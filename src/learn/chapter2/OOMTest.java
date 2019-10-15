package learn.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Vm arguments: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class OOMTest {

    static class OOMObject{
        double a;
        int b;
        int c;
    }
    public static void main(String [] args){
        List<OOMObject> list=new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
