package com.way2learnonline.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullEmpty {

	public static void main(String[] args) {

		String[] names = { "sugtih", "", "Kopparthi", null, "" };

		Predicate<String> rne = s -> s != null && s.length() != 0;

		ArrayList<String> Al = new ArrayList<>();

		for (String s : names) {
			if (rne.test(s)) {
				Al.add(s);
			}

		}
		System.out.println(Al);
	}

}
