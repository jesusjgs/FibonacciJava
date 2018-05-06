package org.uma.pab2018.FibonacciRabbits;

public class Fibonacci {

	public int Compute(int n, int k, int earlier, int beforeThanEarlier) {
		int res;
		if (n > 1) {
			res = Compute(n - 1, k, earlier + beforeThanEarlier * k, earlier);
		} else {
			res = earlier;
		}
		return res;
	}

}
