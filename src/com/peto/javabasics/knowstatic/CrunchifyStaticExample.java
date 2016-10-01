package com.peto.javabasics.knowstatic;

public class CrunchifyStaticExample {
	public static void main(String[] args) {
		CrunchifyStaticDeclaration.setTestValue(5);

		// non-private static variables can be accessed with class name
		CrunchifyStaticDeclaration.testString = "\nAssigning testString a value";
		CrunchifyStaticDeclaration csd = new CrunchifyStaticDeclaration();
		System.out.println(csd.getTestString());

		// class and instance static variables are same
		System.out.print("\nCheck if Class and Instance Static Variables are same:  ");
		System.out.println(CrunchifyStaticDeclaration.testString == csd.testString);
		System.out.println("Why? Because: CrunchifyStaticDeclaration.testString == csd.testString");
	}
}
