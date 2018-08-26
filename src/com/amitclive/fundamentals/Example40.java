package com.amitclive.fundamentals;

public class Example40 {

	public static void main(String[] args) {
		
	  //short s = 32768; Compilation error: cannot convert int to short
	 //	int i = 2147483648; Compilation error: The literal 2147483648 of type int is out of range 
		
	//	long a =2147483648;Compilation error: The literal 2147483648 of type int is out of range 
		
		long a =2147483648L;
		
//		System.out.println(9080979999); Compilation error: The literal 9080979999 of type int is out of range 
		System.out.println(a);
		
		System.out.println(9880979999L);
		
	//	int i = 099; //Compilation error: The literal 099 of type int is out of range
	
	//	System.out.println(i);
		
		int a1 =1010;
		int b1 = 0101;
		System.out.println(a1);
		System.out.println(b1);
		
		
		
	}
}
