package com.bridgelab.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		FibonacciSeries fb = new FibonacciSeries();
		int prev = 0;
		int current = 1;
		System.out.println("Welcome to fibonacci series...!!!");
		System.out.println();
		System.out.println("Enter the number you want to print.");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		fb.printFibonacciNumbers(prev, current, count);
		sc.close();
	}
	private int printFibonacciNumbers(int prev, int current, int count) {
		if(count ==0) {
			return 0;
		} else {
			System.out.print(prev + "\t");
		}
		return printFibonacciNumbers(current, prev+current, --count);
	}

}
