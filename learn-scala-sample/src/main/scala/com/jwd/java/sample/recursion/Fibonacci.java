package com.jwd.java.sample.recursion;

import java.math.BigInteger;

public class Fibonacci {
	
	public static void printFib(int n, BigInteger a, BigInteger b) {
		if (n == 0) {
			return;
		} else {
			System.out.println(n + " - " + a.add(b));
			printFib(n - 1, b, a.add(b));
		}
	}	
	
	public static void main(String args[]) {
		printFib(10, new BigInteger("-1"), BigInteger.ONE);
	}
}
