package control.controlbefore;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

	int LOOP_COUNT = 10000000;
	List<Integer> list;

	public static void main(String[] args) {
		ForLoop loop = new ForLoop();
		loop.setUp();
		loop.traditionalForLoop();
		loop.traditionalSizeForLoop();
		loop.timeForEachLoop();
		loop.timeForLambdaLoop();
	}

	public void setUp() {
		list = new ArrayList<>(LOOP_COUNT);
		for (int loop = 0; loop < LOOP_COUNT; loop++) {
			list.add(loop);
		}
	}

	public void traditionalForLoop() {
		long startTime = System.nanoTime();
		int listSize = list.size();
		for (int loop = 0; loop < listSize; loop++) {
			resultProcess(list.get(loop));
		}
		long endTime = System.nanoTime();
		double elapsedTime = (endTime - startTime) / 1000000000.0;
		System.out.println("traditionalForLoop nano=" + elapsedTime);
	}

	public void traditionalSizeForLoop() {
		long startTime = System.nanoTime();
		for (int loop = 0; loop < list.size(); loop++) {
			resultProcess(list.get(loop));
		}
		long endTime = System.nanoTime();
		double elapsedTime = (endTime - startTime) / 1000000000.0;
		System.out.println("traditionalSizeForLoop nano=" + elapsedTime);
	}

	public void timeForEachLoop() {
		long startTime = System.nanoTime();
		for (Integer loop : list) {
			resultProcess(loop);
		}
		long endTime = System.nanoTime();
		double elapsedTime = (endTime - startTime) / 1000000000.0;
		System.out.println("timeForEachLoop nano=" + elapsedTime);
	}

	public void timeForLambdaLoop() {
		long startTime = System.nanoTime();
		list.forEach(this::resultProcess);
		long endTime = System.nanoTime();
		double elapsedTime = (endTime - startTime) / 1000000000.0;
		System.out.println("timeForLambdaLoop nano=" + elapsedTime);
	}

	int current;

	public void resultProcess(int result) {
		current = result;
	}
}
	
