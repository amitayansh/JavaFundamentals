package com.amitclive.fundamentals;

public class Example49 {

	public static void main(String[] args) {
		char ch1 ='A';
		char ch2 ='B';
		int a =ch1+ch2;
//		char ch3 =ch1+ch2;Compilation error:Type mismatch: cannot convert from int to char
		char ch3 =(char) (ch1+ch2);
		
		int a1 =123;
//		byte b =a; Compilation error: Type mismatch: cannot convert from int to byte
		byte b =(byte) a;
		
		final int a2 =123;
//		byte b1 =a; Compilation error
		byte b1 =(byte) a;
		
		int a3 = 123;
		byte b3 =(byte) a3;
		
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(a);
		System.out.println(a1);
		System.out.println(ch3);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(a2);
		System.out.println(b3);
		System.out.println(a3);
		
	}
}
