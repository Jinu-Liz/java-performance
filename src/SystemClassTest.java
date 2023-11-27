import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class SystemClassTest {
  public static void main(String[] args) {
    long start = System.nanoTime();
    Properties props = System.getProperties();
    Set<Object> set = props.keySet();
    Iterator<Object> it = set.iterator();
    while (it.hasNext()) {
      String key = (String) it.next();
      System.out.printf("key=%s, value=%s", key, props.get(key));
    }
    long end = System.nanoTime();
    System.out.println("duration=" + (end - start));
  }
}
