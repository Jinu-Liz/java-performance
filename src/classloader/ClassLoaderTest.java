package classloader;

import java.lang.reflect.Method;

public class ClassLoaderTest {
  public static void main(String[] args) throws Exception {
    ClassLoader cl = ClassLoader.getSystemClassLoader();
    while (cl != null) {
      System.out.println("cl = " + cl);
      cl = cl.getParent();
    }

    // 클래스 로딩
    Class<?> clazz = Class.forName("classloader.ClassLoaderTest");
    for (Method method : clazz.getMethods()) {
      System.out.println("method Name = " + method.getName());
    }
  }
}
