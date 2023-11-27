package memoryarea;

import java.util.Scanner;

public class MemoryAreaTest {
  public static void main(String[] args) {
    Emp emp = new Emp();
    emp.id = 1111;
    print(emp);
  }

  private static void print(Emp emp) {
    System.out.println("emp = " + emp);
    emp.id = 2222;
    next();
  }

  private static void next() {
    // 아래가 실행될 때 프로그램이 잠시 멈춰진다.
    new Scanner(System.in).next();
  }
}
