package exstackheap;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Main main = new Main();
		main.start();
	}
	
	public void start() {
		String last = "Z";
		Container container = new Container();
		container.setInitial("C");
		another(container,last);
		System.out.print(container.getInitial());
	}
	
	public void another(Container holder, String newInitial) {
		newInitial.toLowerCase();
		holder.setInitial("B");
		Container tempContainer = new Container();
		holder=tempContainer;
		System.out.print(holder.getInitial());
		System.out.print(newInitial);
//		new Scanner(System.in).next();
	}
}

/**
 * Heap
 * Main main = new Main();
 * Container container = new Container();
 *
 * Stack
 * String Initial = "A";
 * String last = "Z";
 * Container holder, String newInitial
 *
 *
  */