package com.bridgelab.couponnumber;

import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Lucky Draw..!!");
		System.out.println("Please enter the number of coupons to be generated..!");
		int N = sc.nextInt();
		CouponNumber.findCoupon(N);
		sc.close();
	}
	
	public static void findCoupon(int N) {
		int distinctnumber = 0;
		int random = 0;
		for(int i = 1; i <= N; i++) {
			random=(int)(Math.random()*900+100);  
			if(random == distinctnumber) {
				System.out.println("TRY NEXT!!");
			}										
			else {
				System.out.println("Coupon numbers are : " + random);
			}
			distinctnumber = random;
		}
	}
}
