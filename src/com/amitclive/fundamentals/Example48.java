package com.amitclive.fundamentals;

public class Example48 {
	public static void main(String[] args) {
		
//		System.out.println(true >= true); Compilation error: The operator >= is undefined for the argument type(s) boolean, boolean
//		System.out.println(true == 0);Compilation error: The operator == is undefined for the argument type(s) boolean, int
		System.out.println(10/3 == 10/3);
        System.out.println(0.0/0 == 0.0/0);
        double d =0.0/0;
        System.out.println(d == d);
        System.out.println(d == 0);
        System.out.println(d ==1);
        System.out.println(10/3 != 10/3);
        System.out.println(0.0/0!=0.0/0);
        System.out.println(d != d);
        System.out.println(d != 0);
        System.out.println(d != 1);
        int a =10;
        System.out.println(a == a);
        System.out.println(""+(a==a));
        
	}

}
