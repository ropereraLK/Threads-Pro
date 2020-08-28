package com.threadspro.javaclass;

public class MyRunnable implements Runnable {

	private String value;

	public MyRunnable(String value) {
		this.value = value + " ";

	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(value + i);
			try {
				java.util.concurrent.TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
