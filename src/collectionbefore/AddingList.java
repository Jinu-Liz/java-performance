package collectionbefore;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class AddingList  {
	int LOOP_COUNT=1000;
	List<Integer> arrayList;
	List<Integer> vector;
	List<Integer> linkedList;
	
	public static void main(String[] args) {
		AddingList list=new AddingList();
		list.addArrayList();
		list.addArrayListWithInitialSize();
		list.addVector();
		list.addLinkedList();
	}

	public void addArrayList() {
		long startTime=System.nanoTime();
		arrayList= new ArrayList<>();
		for(int loop=0;loop<LOOP_COUNT;loop++) {
			arrayList.add(loop);
		}
		long endTime=System.nanoTime();
		double elapsedTime=(endTime-startTime)/1000000.0;
		System.out.println("addArrayList nano="+elapsedTime);
	}
	
	public void addArrayListWithInitialSize() {
		long startTime=System.nanoTime();
		arrayList= new ArrayList<>(LOOP_COUNT);
		for(int loop=0;loop<LOOP_COUNT;loop++) {
			arrayList.add(loop);
		}
		long endTime=System.nanoTime();
		double elapsedTime=(endTime-startTime)/1000000.0;
		System.out.println("addArrayListWithInitialSize nano="+elapsedTime);
	}

	public void addVector() {
		long startTime=System.nanoTime();
		vector= new Vector<>();
		for(int loop=0;loop<LOOP_COUNT;loop++) {
			vector.add(loop);
		}
		long endTime=System.nanoTime();
		double elapsedTime=(endTime-startTime)/1000000.0;
		System.out.println("addVector nano="+elapsedTime);
	}
	
	public void addLinkedList() {
		long startTime=System.nanoTime();
		linkedList= new LinkedList<>();
		for(int loop=0;loop<LOOP_COUNT;loop++) {
			linkedList.add(loop);
		}
		long endTime=System.nanoTime();
		double elapsedTime=(endTime-startTime)/1000000.0;
		System.out.println("addLinkedList nano="+elapsedTime);
	}
	
}