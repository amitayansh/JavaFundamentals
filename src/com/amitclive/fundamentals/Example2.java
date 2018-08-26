package com.amitclive.fundamentals;

//Example to tom compare default value of character to other values
public class Example2 {

	char ch;

	void show() {
		System.out.println(ch == 0);
		System.out.println(ch == '\u0000');

	}

	public static void main(String[] args) {

		Example2 example = new Example2();
		example.show();

	}

}
