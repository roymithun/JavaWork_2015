package com.peto.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkedList {

	public static void main(String[] args) {
		/*
		 * LinkedList
		 */
		long start = System.nanoTime();
		long size1 = Runtime.getRuntime().freeMemory();
		LinkedList<String> linkedList = new LinkedList<String>();
		long step1 = System.nanoTime();
		System.out.println("Time elapsed step1->" + (step1 - start));
		for (int i = 0; i < 1000000; i++) {
			linkedList.add("hello " + i);
		}
		long size2 = Runtime.getRuntime().freeMemory();
		long step2 = System.nanoTime();
		System.out.println("space occupied->" + (size2 - size1) + " bytes");
		System.out.println("Time elapsed step2->" + (step2 - step1));
		// String s = linkedList.get(532445);
		linkedList.remove(999999);
		long end = System.nanoTime();
		System.out.println("Time elapsed->" + (end - step2));

		/*
		 * ArrayList
		 */
		long start1 = System.nanoTime();
		long size11 = Runtime.getRuntime().freeMemory();
		ArrayList<String> arrayList = new ArrayList<String>();
		long step11 = System.nanoTime();
		System.out.println("Time elapsed step11->" + (step11 - start1));
		for (int i = 0; i < 1000000; i++) {
			arrayList.add("hello " + i);
		}
		long size21 = Runtime.getRuntime().freeMemory();
		long step21 = System.nanoTime();
		System.out.println("space occupied 1->" + (size21 - size11) + " bytes");
		System.out.println("Time elapsed step21->" + (step21 - step11));
		// String s1 = arrayList.get(532445);
		arrayList.remove(999999);
		long end1 = System.nanoTime();
		System.out.println("Time elapsed 1->" + (end1 - step21));
	}
}
