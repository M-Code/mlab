package com.mcode.mlab.euler;

import java.util.HashSet;
import java.util.Set;

public class Problem31 implements Problem {
	private Set<Integer> money = new HashSet<Integer>();
	public Problem31() {
		money.add(1);
		money.add(2);
		money.add(5);
		money.add(10);
		money.add(20);
		money.add(50);
		money.add(100);
		money.add(200);
	}
	
	private int ways(int currentVal, int add, int goal) {
		if(currentVal == goal) {
			return 1;
		} else if(currentVal > goal) {
			return 0;
		} else {
			int sum = 0;
			for(Integer m : money) {
				if(m >= add)
					sum += ways(currentVal + m, m, goal);
			}
			return sum;
		}
	}

	public String solve() {
		return "" + ways(0, 0, 200);
	}
	
	public static void main(String[] args) {
		Problem31 problem = new Problem31();
		Benchmark.run(problem);
	}

}
