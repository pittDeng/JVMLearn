package learn.chapter10;


public class AutoBoxing {
    public static void main(String [] args){
        Integer a=1;
        Integer b=1;
        Integer c=200;
        Integer d=200;
        Integer e=2;
        Integer f=400;
        Long g=2L;
        Character h='a';
        Character i='a';
        System.out.println(h==i);
        System.out.println(g.equals(a+b));
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(g==a+b);
        System.out.println(f==c+d);
    }
}
