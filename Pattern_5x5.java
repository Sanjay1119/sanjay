package com.pattern;
//5*5 pattern
public class Pattern_5x5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	//Right angled triangle
		int n=97;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(n));
				n++;
			}
			System.out.println();
		}
	
	//reverse of right angled triangle
	for (int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	//Triangle using Alphabets
	int v=97;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(v));
			n++;
		}
		System.out.println();
	}
	//print 5*5 using integer value
	int a=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(a);
			a++;
		}
		System.out.println();
	}
	
	//to print right angle diamond
	
	int b=97;
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
			n++;
		}
		System.out.println();
	}
	for (int i=1;i<=3;i++)
	{
		for(int j=3;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	}
}
