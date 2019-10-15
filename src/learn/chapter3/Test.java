package learn.chapter3;

public class Test {
    private static final int _1MB=1024*1024;

    /**
     * vm args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=2M -XX:+UseSerialGC
     */
    public static void testPretenureSizeThreshold(){
        byte [] allocation,allocation1;
        allocation=new byte[4*_1MB];
        allocation1=new byte[4*_1MB];
    }
    /**
     * vm args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
     */
    public static void testTenuringThreshold(){
        byte[] allocation1,allocation2,allocation3;
        allocation1=new byte[_1MB/4];
        allocation2=new byte[4*_1MB];
        allocation3=new byte[4*_1MB];
        allocation3=null;
        allocation3=new byte[4*_1MB];

    }
    public static void main(String [] args){
        testTenuringThreshold();
    }
}
