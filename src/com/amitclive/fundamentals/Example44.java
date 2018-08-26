package com.amitclive.fundamentals;

public class Example44 {

	public static void main(String[] args) {
		float f1= 129.8763e2F;
		double d1 =129.8763e+2;
		double d2 = 12987.63e-2;
		
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(d2);
		
		double d3 = 077;
		double d4 = 077.0;
		double d5 = 0XA9;
	//	double d6 = 0XA9.0; //Compilation error: Invalid hex literal number
		
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
//		System.out.println(d6);
		
		double d7 = 0XA9.0P0;
		double d8 = 0XA9.P0;
		double d9 = 0XaP0;
		double d10 = 0XaP1;
		double d11 = 0XaP2;
		
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);
		System.out.println(d11);
		
		double d12 = 0XfP2D;
		float f = 0Xf.aP1F;
		
		float ff =0x1f.a5p1F;
		
		double dd =0B1011;
//		double dd1 = 0B1011.1; Compilation error:
		System.out.println(d12);
		System.out.println(f);
		System.out.println(ff);
		System.out.println(dd);
		
	}
}
