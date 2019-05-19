package com.way2learnonline.function;

import java.util.function.Function;

public class StringFunction {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();

		System.out.println(f.apply("Sugith"));

	}

}
