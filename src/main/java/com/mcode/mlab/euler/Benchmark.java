package com.mcode.mlab.euler;

public class Benchmark {

	public static void run(Problem problem) {
		System.out.println("Starting benchmark...");
		long time = System.currentTimeMillis();
		problem.solve();
		time = System.currentTimeMillis() - time;
		System.out.println("This problem took " + time + " milliseconds to solve!");
	}

}
