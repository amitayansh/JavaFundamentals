package com.amitclive.fundamentals;

public class Example45 {

	public static void main(String[] args) {
		int a=24512452;
//	    int b =2,45,12,452; //Compilation error:Type mismatch: cannot convert from int[] to int
		int aa =2_45_12_452;
		int  _12 = 9898;
		
		int a1 = _12;
//		int a2= _234; Compilation error :_234 cannot be resolved to a variable
//		int a3 = 234_;Compilation error:Underscores have to be located within digits
		
		int a4 =0_77;
		int a5 = 0b1_01_01;
//		int a6 = 0b_101; Compilation error: Underscores have to be located within digits
		
		int a7 = 9__89_81_232;
		int a8 = 0X1_A_F;
//		int a9 = 0X_1_A_F; Compilation error: Underscores have to be located within digits
		double d =1_2_3.4_5_6;
		
//		double d1 =123_.45; Compilation error: Underscores have to be located within digits
//		double d2 =123._45; Compilation error: Underscores have to be located within digits
		
		
		System.out.println(a);
		System.out.println(aa);
		System.out.println(_12);
		System.out.println(a1);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(d);
		
		
		
		
	}
}
