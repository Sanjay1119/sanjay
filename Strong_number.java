package com.cg.Strong;
import java.util.Scanner;
public class Strong_number {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the number");
	   int	n=sc.nextInt();
	   int temp,temp2=0,fact=1,given_no=n;
	   while (n!=0) {
		   temp=n%10;
		   temp2=temp2+fact(temp);
		   n=n/10;}
	   if(given_no==temp2) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("It is not Strong number");
		}
			
	   }
	 public static int fact(int temp){
	 {
		 int fact=1;
		 for (int i=1;i<=temp;i++)
		 {
			  fact=fact*i;
			 
		 }return fact;
	 }
	
				
	}{

	
	}
	

}
