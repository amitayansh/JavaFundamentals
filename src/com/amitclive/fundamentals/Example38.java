package com.amitclive.fundamentals;

public class Example38 {

	public static void main(String[] args) {
		String str =null;
		System.out.println(str);
//		int x =str.length();//RunTime Error: NullPointerException
//		System.out.println(x);
		
		String str1 ="";
		System.out.println(str1);
		int y =str1.length();
		System.out.println(y);
		
		String str2 ="amitclive";
		System.out.println(str2);
		int z =str2.length();
		System.out.println(z);
		
		
		String str3 ="ASCII OF A is 65";
		System.out.println(str3);
		
		String str4 ="UNICODE OF A is \u0041";
		System.out.println(str4);
		
		String str5 ="UNICODE OF A is \\u0041";
		System.out.println(str5);
		
		String dir1= "D:\new\test\batch";
		System.out.println(dir1);
		String dir2 ="D:\\new\\test\\batch";
		System.out.println(dir2);
		
	//	String dir3 = "D:\java\core"; 
	//	System.out.println(dir3); 
		
		String str6 ="Octal of 65 is \101";
		System.out.println(str6);
		
		String str7 ="Octal of 65 is \\101";
		System.out.println(str7);
	}
}
