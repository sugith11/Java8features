package com.way2learnonline;

@FunctionalInterface
public interface FunctionalInterf {

	/*
	 * 1. Functional interface should contain only one abstract method. 2. can
	 * contain n number of default or static methods 3. Should contain at-least on
	 * abstract method. 4. Writing @FunctionalInterface means we are telling to
	 * compiler this is functional interface.
	 */

	/*
	 * Example 1:
	 * 
	 * public void m1();
	 */

	/*
	 * Example 2:
	 * 
	 * public void add(int a,int b);
	 */

	/*
	 * Example 3:
	 * 
	 * public int lengthOfString(String s);
	 */

	/*
	 * Exapmle 4:
	 * 
	 * public int sqrt(int c);
	 */

	public void m1();
	
}
