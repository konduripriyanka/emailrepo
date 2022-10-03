package arthmeticcalc;

import java.util.Scanner;


public class newcalc {

	public static void main(String[] args) {
		
		int num1,num2;
		char opr;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two numbers :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("enter your operator :");
		opr=sc.next().charAt(0);
		 
		switch(opr) {
		case '+':
			System.out.println("addition of two num = "+(num1+num2));
			break;
		case '-':
			System.out.println("substraction of num = "+(num1-num2));
			break;
		case '*':
			System.out.println("muntiply of num = "+(num1*num2));
			break;
		case '/':
			System.out.println("division of nums = "+(num1/num2));
			break;
			
		
		}
		// TODO Auto-generated method stub

	}

}
