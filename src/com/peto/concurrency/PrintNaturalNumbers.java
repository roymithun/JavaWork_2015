package com.peto.concurrency;

/*
 * Print natural numbers using 2 threads
 * http://stackoverflow.com/a/16706193/2694480
 */

public class PrintNaturalNumbers {

	static boolean isOdd = false;

	public static void main(String[] args) {
		Printer printer = new Printer();
		Thread to = new Thread(new TaskEvenOdd(printer, 10, false));
		Thread te = new Thread(new TaskEvenOdd(printer, 10, true));
		to.start();
		te.start();
	}
}

class TaskEvenOdd implements Runnable {

	private int max;
	private Printer print;
	private boolean isEvenNumber;

	TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
		this.print = print;
		this.max = max;
		this.isEvenNumber = isEvenNumber;
	}

	@Override
	public void run() {

		// System.out.println("Run method");
		int number = isEvenNumber == true ? 2 : 1;
		while (number <= max) {

			if (isEvenNumber) {
				// System.out.println("Even :"+
				// Thread.currentThread().getName());
				print.printEven(number);
				// number+=2;
			} else {
				// System.out.println("Odd :"+
				// Thread.currentThread().getName());
				print.printOdd(number);
				// number+=2;
			}
			number += 2;
		}

	}

}

class Printer {

	boolean isOdd = false;

	synchronized void printEven(int number) {

		while (isOdd == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Even:" + number);
		isOdd = false;
		notifyAll();
	}

	synchronized void printOdd(int number) {
		while (isOdd == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Odd:" + number);
		isOdd = true;
		notifyAll();
	}

}
