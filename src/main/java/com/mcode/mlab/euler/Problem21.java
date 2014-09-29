package com.mcode.mlab.euler;

public class Problem21 implements Problem {

	public String solve() {
		int answer = 0;
		
		for(int i = 2; i <= 10000; i++) {
			int sum = divisorSum(i);
			if(sum != i && divisorSum(sum) == i) {
				answer += i;
			}
		}
		return "" + answer;
	}
	
	private int divisorSum(int num) {
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Benchmark.run(new Problem21());
	}

}
