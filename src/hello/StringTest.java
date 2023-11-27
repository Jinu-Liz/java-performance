package hello;

public class StringTest {
  public static void main(String[] args) {
    String str = new String("hello");
    String str2 = new String("hello");
    System.out.println(str == str2);

    String str3 = "Hello";
    String str4 = "Hello";
    System.out.println(str3 == str4);
  }
}
