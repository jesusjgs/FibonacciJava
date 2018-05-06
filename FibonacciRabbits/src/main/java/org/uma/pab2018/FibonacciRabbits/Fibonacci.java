package org.uma.pab2018.FibonacciRabbits;

public class Fibonacci {

	public int Compute(int n, int k, int earlier, int beforeThanEarlier) {
		int res;
		if(n>40 || n<0 || k>5 || k<0) {
			throw new RuntimeException("Error introducing data");
		}
		else {
		if (n > 1) {
			res = Compute(n - 1, k, earlier + beforeThanEarlier * k, earlier);
		} else {
			res = earlier;
		}
		return res;
	}
	}

}
