package arthmeticcalc;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int num1,num2,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number:");
		num1=sc.nextInt();
		 
		System.out.println("enter 2nd number:");
		num2=sc.nextInt();
		
		System.out.println("enter the operators(+,-,*,/)");
		
		System.out.println("enter ur choice:");
		ch=sc.nextInt();
		
		if(ch==1)
		{
			System.out.println("addition = "+(num1+num2));
		}
		else if(ch==2)
		{
			System.out.println("substraction = "+(num1-num2));
		}
		else if(ch==3)
		{
			System.out.println("multiplication = "+(num1*num2));
		}
		else if(ch==4)
		{
			System.out.println("division = "+(num1/num2));
			
		}
		
	
			
		
		}

}
