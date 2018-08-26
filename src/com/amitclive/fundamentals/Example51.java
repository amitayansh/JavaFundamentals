package com.amitclive.fundamentals;

public class Example51 {

	
	public static void main(String[] args) {
		System.out.println( true  || true);
		System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        
        int a =99;
        long b = 65799999;
        boolean b1 =(a == 99) || (b ==65799999);
        boolean b2 =(a == 99) || (b == 65799999);
        boolean b3 =(a ==88)|| (b == 65799999);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        
        int a1 =12;
        boolean b4 =a1>10 || a1++<5;
        System.out.println(a1);
        System.out.println(b4);
        
        boolean b5 = a1 >15|| a++ <5;
        System.out.println(b5);
        
        
	}
}
