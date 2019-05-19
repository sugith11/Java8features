package com.way2learnonline.function;

import java.util.function.Function;

public class SqrtFunction {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		
		System.out.println(f.apply(5));

	}

}
