package com.bridgelabz;
public class findMaximum 
{
	public static void main(String[] args) 
	{		
		System.out.println("Welcome to maximum generics problems");
        Float x = 2.3f;
        Float y = 7.8f;
        Float z = 6.7f;
        String a = "apple";
		String b = "peach";
		String c = "banana";
        Integer d = 20;
        Integer e = 42; 
        Integer m = 65;

		findMaximum.biggesOfThree (a,b,c);
		findMaximum.biggesOfThree (x,y,z);
		findMaximum.biggesOfThree (d,e,m);

	}

	public static void biggesOfThree(String a, String b, String c)

	private static <T extends Comparable> void biggesOfThree(T a, T b, T c)
	{
		String max = a; // assume x is initially the largest

	    if (b.compareTo(max) > 0)
	      max = b; // y is the largest so far
		T max = a; // assume a is initially the largest

	    if (c.compareTo(max) > 0)
	      max = c; // z is the largest
	    if (b.compareTo(max) > 0) {
	      max = b; // b is the largest so far
	    }
	    if (c.compareTo(max) > 0) {
	      max = c; // c is the largest
	    }
		System.out.println("Maximum Number Is " + max);

	}

	public static void main(String[] args) 
	{		
		System.out.println("Welcome to maximum generics problems");
		String a = "Rushikesh";
		String b = "Ajay";
		String c = "Dinesh";
		biggesOfThree (a,b,c);
	}


}
