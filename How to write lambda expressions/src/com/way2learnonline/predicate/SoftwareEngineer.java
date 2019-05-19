package com.way2learnonline.predicate;

import java.util.function.Predicate;

public class SoftwareEngineer {

	String name;
	int age;
	boolean girlFriend;

	public SoftwareEngineer(String name, int age, boolean girlFriend) {
		super();
		this.name = name;
		this.age = age;
		this.girlFriend = girlFriend;
	}

	@Override
	public String toString() {

		return "Name : " + name + "Age : " + age;
	}

	public static void main(String[] args) {
		SoftwareEngineer[] selist = { new SoftwareEngineer("Sugith", 30, true),
				new SoftwareEngineer("Kayosh", 14, false), new SoftwareEngineer("siva", 37, true),
				new SoftwareEngineer("Teja", 22, false)

		};

		Predicate<SoftwareEngineer> p = SoftwareEngineer -> SoftwareEngineer.age > 18
				&& SoftwareEngineer.girlFriend == true;

		for (SoftwareEngineer softwareEngineer : selist) {

			if (p.test(softwareEngineer)) {

				System.out.println("Eligible : " + softwareEngineer);
			} else {
				System.out.println("Not eligible:" + softwareEngineer);
			}

		}
	}

}
