package hello;

public class StackTest {
  public static void main(String[] args) {
    methodA();
  }

  private static void methodA() {
    int count = 500;
    methodB();
  }

  private static void methodB() {
    int count = 500;
    System.out.println("count = " + count);
  }
}
