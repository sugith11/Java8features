package com.way2learnonline.predicate;

import java.util.function.Predicate;

public class NamesStartWithK {

	public static void main(String[] args) {

		String[] names = { "kopparthi", "Sugith", "kayosh" };

		Predicate<String> swk = s -> s.startsWith("k");

		System.out.println("Names Start With K are : ");
		for (String s : names)
		{
			if (swk.test(s)) 
			{
				System.out.println(s);
			}
		}

	}

}
