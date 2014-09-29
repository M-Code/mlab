package com.mcode.mlab.euler;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Problem29 implements Problem {

	public String solve() {
		Set<BigDecimal> count = new HashSet<BigDecimal>();
		for(int i = 2; i <= 100; i++) {
			for(int j = 2; j <= 100; j++) {
				count.add(new BigDecimal(i).pow(j));
			}
		}
		return "" + count.size();

	}

	public static void main(String[] args) {
		Benchmark.run(new Problem29());
	}

}
