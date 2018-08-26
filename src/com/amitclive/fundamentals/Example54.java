package com.amitclive.fundamentals;

public class Example54 {
	
	public static void main(String[] args) {
		int a =15;
		int b=~a;
		System.out.println(a);
		System.out.println(b);
		
//		System.out.println(~12.90); Compilation error :The operator ~ is undefined for the argument type(s) boolean
//		System.out.println(~true); Compilation error:The operator ~ is undefined for the argument type(s) boolean
	
	   System.out.println(true & true);
	   System.out.println(true & false);
	   System.out.println(false & true);
	   System.out.println(false & false);
	   
	   
	   int a1 =60;
	   int b1 = 13;
	   int c1 =a&b;
	   System.out.println(a1);
	   System.out.println(b1);
       System.out.println(c1);
       
       int a3 =12;
       boolean bool =a3>10 & a++<5;
       System.out.println(a3);
       System.out.println(bool);
       
       boolean bool1 = a>15 & a++<5;
       System.out.println(a3);
       System.out.println(bool1);
       
       System.out.println(true |true);
       System.out.println(true | false);
       System.out.println(false |false);
       System.out.println(false |false);
       
       int a4 =60;
       int b4= 13;
       int c4 =a4|b4;
       System.out.println(a4);
       System.out.println(b4);
       System.out.println(c4);
       
       int a5 =12;
       boolean bool2 =a5>10| a5++<5;
       System.out.println(a5);
       System.out.println(bool2);
       boolean bool3 =a5>15|a5++<5;
       System.out.println(a5);
       System.out.println(bool3);
       
       
       System.out.println(true ^ true);
       System.out.println(true ^ false);
       System.out.println(false ^ true);
       System.out.println(false ^ false);
       
       int a6 =60;
       int b6 =13;
       int c6 =a6^b6;
       System.out.println(a6);
       System.out.println(b6);
       System.out.println(c6);
       
       
	}

}
