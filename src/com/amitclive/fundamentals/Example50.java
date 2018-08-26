package com.amitclive.fundamentals;

public class Example50 {
	
	public static void main(String[] args) {
		System.out.println(!true);
		System.out.println(!false);
		int a =10;
//		System.out.println(!a); Compilation error: The operator ! is undefined for the argument type(s) int
	    System.out.println(!(a== 10));
	    
	    System.out.println(true && true);
	    System.out.println(true && false);
	    System.out.println(false && true);
	    System.out.println(false && false);
	    
	    int a1 =99;
	    long b = 65799999;
	    boolean b1 =(a== 99 )&& (b == 65799999);
	    boolean b2 = (a ==99) && (b == 65799990);
	    System.out.println(b1);
	    System.out.println(b2);
	    
	    int a2 =12;
	    boolean b3 = a2>10 && a++ < 5;
	    System.out.println(a2);
	    System.out.println(b3);
	    
	    boolean b4 = a2>15 && a2++ < 5;
	    System.out.println(a2);
	    System.out.println(b4);
		
	}

}
