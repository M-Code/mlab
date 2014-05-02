package com.mlab.euler;

import java.util.HashSet;
import java.util.Set;

public class Problem23 implements Problem {

	public void solve() {
		int sum = 0;
		Set<Integer> abundantSet = new HashSet<Integer>();
		Set<Integer> possibleSum = new HashSet<Integer>();
		for(int i = 12; i < 28123; i++) {
			if(isAbundant(i)) {
				abundantSet.add(i);
			}
		}
		
		for(Integer num1 : abundantSet) {
			for(Integer num2 : abundantSet) {
				possibleSum.add(num1 + num2);
			}
		}
		
		for(int i = 1; i <= 28123; i++) {
			if(!possibleSum.contains(i)) {
				sum+= i;
			}
		}
		
		System.out.println(sum);
	}
	
	private boolean isAbundant(int num) {
		if(num < 12) {
			return false;
		} else {
			int sum = 0;
			for(int i = 1; i < num; i++) {
				if(num % i == 0) {
					sum += i;
					if(sum > num) {
						return true;
					}
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		Benchmark.run(new Problem23());
	}

}
