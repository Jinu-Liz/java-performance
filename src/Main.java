public class Main {

	public static void main(String[] args) {
		PrimeNumberList list = new PrimeNumberList();
		Integer max = Integer.parseInt(args[0]);
		list.generateNumbers(max);
	}

}