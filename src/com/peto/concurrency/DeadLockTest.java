package com.peto.concurrency;

public class DeadLockTest {

	public static void main(String[] args) {
		final Box box = new Box();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				box.method1();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				box.method2();
			}
		});
		t1.start();
		t2.start();
	}
}

class Box {
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	public void method1() {
		synchronized (lock1) {
			System.out.println("method1 1st phase");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (lock2) {
				System.out.println("method1 2nd phase");
			}
		}
	}

	public void method2() {
		synchronized (lock2) {
			System.out.println("method2 1st phase");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (lock1) {
				System.out.println("method2 2nd phase");
			}
		}
	}
}