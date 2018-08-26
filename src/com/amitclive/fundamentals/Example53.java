package com.amitclive.fundamentals;

public class Example53 {
	public static void main(String[] args) {
		int a = true?10:20;
		System.out.println(a);
		
		int b =false?10:20;
		System.out.println(b);
		
//		int c =20>10?10:20.0; Compilation error: Type casting is required
		int c =(int) (20>10?10:20.0);
		System.out.println(c);
		double d =20>10?10:20.0;
		System.out.println(d);
		
//		int a1 = 10>20?10:"TWENTY"; Compilation error:Type mismatch: cannot convert from Object&Comparable<?>&Serializable to int
		
//		String str =10>20?10:"TWENTY";Compilation error: Type mismatch: cannot convert from Object&Comparable<?>&Serializable to String
		
		Object obj =10>20?10:"TWENTY";
		System.out.println(obj);
		
		int a1=10;
		int a2 =20;
		int max =a>b?a:b;
		System.out.println(max);
		
		int min =a<b?a:b;
		System.out.println(min);
		
		int c2 =23;
		int max1 =(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(max1);
		
		
	}

}
