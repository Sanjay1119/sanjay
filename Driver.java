package Qspiders;
import java.util.Scanner;

public class Driver {
	static
	{
		System.out.println("--------------Welcome to qspiders--------------");
	}
	static boolean flag=true;
	public static void main(String[]args) throws Exception
	{
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select any option below \n 1.login \n 2.Qspiders details \n 3.logout");
		
			switch(sc.nextInt())
		
		{
		case(1):
		{
			login();
			break;
		}
		case(2):
		{
			Qspiders.qspidersDetails();
			break;
		}
		case(3):
		{
			logout();
			flag=false;
			break;
		}
		default:
		{
			System.out.println("invalid number");
		}
		}
		}
		while(flag);
		  
	}
	
	public static void login()
	{
		System.out.println("Login sucessful!!!");
	}
	public static void logout()
	{
		System.out.println("Logout sucessful!!!");
	}

}
