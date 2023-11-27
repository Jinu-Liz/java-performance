package heapstack;

public class HeapStackTest {
  public static void main(String[] args) {
    Emp emp = new Emp();
    emp.id = 3333;
    for (int i = 0; i < 10; i++) {
      getPrint(emp);
    }
    System.out.println("Emp=" + emp.id);
  }

  private static void getPrint(Emp paramEmp) {
    System.out.println("paramEmp.id = " + paramEmp.id);
    paramEmp.id = 4444;
  }
}
