package learn.chapter10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GenericTest {
    public static void main(String[]args){
        Map<String,String>map=new HashMap<>();
        map.put("hello","你好");
        map.put("how are you","你吃了吗");
        System.out.println(map.get("hello"));
        System.out.println(map.get("how are you"));
    }
}
