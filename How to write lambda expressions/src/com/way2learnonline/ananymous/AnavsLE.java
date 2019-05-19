package com.way2learnonline.ananymous;

public interface AnavsLE {

	public void m1();

}
// By using ananymous class
/*
 * class Test1 {
 * 
 * int x = 768;
 * 
 * public void m2() {
 * 
 * AnavsLE ale = new AnanymousvsLambdaexpression() 
 * { 
 * 
 * int x = 867;
 * 
 * @Override 
 * public void m1() {
 *  System.out.println(this.x);
 * 
 * }
 *  };
 *  
 *  ale.m1(); }
 *   }
 */

// BY using Lambda expression
class Test1 {

	int x = 768;

	public void m2() {

		AnavsLE ale = () -> {

			int x = 867;
			System.out.println(this.x);
		};

		ale.m1();
	};

}
