package learn.chapter7;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {
    public static void main(String [] args) throws Exception{
        ClassLoader myLoader=new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try{
                    String fileName=name.substring(name.lastIndexOf(".")+1)+".class";
                    InputStream is=getClass().getResourceAsStream(fileName);
                    if(is==null){
                        return super.loadClass(name);
                    }
                    byte []b=new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);
                }catch (IOException e){
                    throw new ClassNotFoundException(name);
                }
            }

//            @Override
//            public Class<?> loadClass(String name) throws ClassNotFoundException {
//                System.out.println("new classLoader");
//                return super.loadClass(name);
//            }
        };
        Object obj=myLoader.loadClass("learn.chapter7.ClassLoaderTest").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof learn.chapter7.ClassLoaderTest );
    }
}
