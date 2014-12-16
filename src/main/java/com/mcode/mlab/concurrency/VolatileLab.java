package com.mcode.mlab.concurrency;

/**
 * Volatile variables are not thread-safe!
 */
public class VolatileLab
	public volatile int a = 0;

	public static void main(String[] args) throws Exception {
		final VolatileLab vol = new VolatileLab();
		
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for(int i = 0; i < 100000; i++)
					vol.a = vol.a + 1;
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 100000; i++)
					vol.a = vol.a + 1;
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("a == " + vol.a);

	}

}
