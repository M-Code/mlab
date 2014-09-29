package com.mcode.mlab.euler;

public class Benchmark {

	public static void run(Problem problem) {
		System.out.println("Starting benchmark...");
		long time = System.currentTimeMillis();
		String answer = problem.solve();
		time = System.currentTimeMillis() - time;
		System.out.println("The answer to " + problem.getClass().getSimpleName() + " is " + answer);
		System.out.println("This problem took " + time + " milliseconds to solve!");
	}

}
