package com.amitclive.fundamentals;

//Example to print default values for all types
public class Example1 {

	boolean b1;
	byte b2;
	short s;
	int i;
	long l;
	float f;
	double d;
	String str;
	Example1 example;

	void show() {
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println();
		System.out.println(b1);
		System.out.println(b1);
	}

	public static void main(String[] args) {

		Example1 example = new Example1();
		example.show();

	}

}
