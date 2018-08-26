package com.amitclive.fundamentals;

public class Example46 {

	public static void main(String[] args) {
		int a = 19;
		int b = +a;
		int c = -a;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		byte b1 = 19;
		// byte b2 = +b1; Compilation error: Type mismatch: cannot convert from
		// int to byte
		// we need to typecast it to byte
		byte b2 = (byte) +b1;
		// byte b3 = -b1; Compilation error: Type mismatch: cannot convert from
		// int to byte
		// we need to typecast it to byte
		byte b3 = (byte) -b1;
		
		int a1 = 99;
		int a2 = -(-a);
		
		int a3=  --a1;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);		
		
	}
}
