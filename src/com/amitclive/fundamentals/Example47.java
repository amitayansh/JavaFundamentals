package com.amitclive.fundamentals;

public class Example47 {
	public static void main(String[] args) {
      char ch1 ='A';
  //    char ch2 =+ch1; Compilation Error: Type mismatch: cannot convert from int to char
      char ch2 =(char) +ch1;
      int a =+ch1;
      double d1 =1234.567;
      double d2 =-d1;
      double d3 =+d1;
      
      byte b1 =12;
      byte b2 = 23;
      int a3 =b1+b2;
  //    byte b3 =b1+b2; Compilation error:Type mismatch: cannot convert from int to byte 
      
      byte b3 =(byte) (b1+b2);
      
      System.out.println(ch1);
      System.out.println(ch2);
      System.out.println(d1);
      System.out.println(d2);
      System.out.println(d3);
      System.out.println(b1);
      System.out.println(b2);
      System.out.println(a3);
	}

}
