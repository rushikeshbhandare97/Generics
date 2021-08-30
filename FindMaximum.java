package com.bridgelabz;
public class findMaximum 
{

	public static void biggesOfThree(Float a, Float b, Float c)
	public static void biggesOfThree(String a, String b, String c)
	{
		Float max = a; // assume x is initially the largest
		String max = a; // assume x is initially the largest

	    if (b.compareTo(max) > 0)
	      max = b; // y is the largest so far
@@ -18,9 +18,9 @@ public static void biggesOfThree(Float a, Float b, Float c)
	public static void main(String[] args) 
	{		
		System.out.println("Welcome to maximum generics problems");
		Float a = 10.10f;
		Float b = 2000.12312f;
		Float c = 300.300f;
		String a = "Rushikesh";
		String b = "sameer";
		String c = "Ajay";
		biggesOfThree (a,b,c);
	}

}
