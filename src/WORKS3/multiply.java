package WORKS3;

import java.util.Scanner;

public class multiply {
//Build a basic calculator (Plus, Minus, Multiplication, Division)
	//a.	(Ask user for a number and then ask for the second number 
	//		– then ask for the operation: ADD, SUB, MULTI, DIV)
	//		b.	Use “IF and ELSE” or “SWITCH”
	//		c.	Use method for each operation
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
	
		System.out.println("give me first num");
		int  num =abc.nextInt();
	     System.out.println("give me 2nd num");
	     int num1=abc.nextInt();
	     System.out.println("what you want to do?");
		
	String xyz = abc.next();
	     
		if (xyz.equals("add")) {
			System.out.println( add (num,num1));
		}
		else if (xyz.equals("sub")) {
			System.out.println(sub(num,num1));}
		else if(xyz.equals("multiply")) {
			System.out.println(multiply(num,num1));}
		else if (xyz.equals("divide")) {
			System.out.println(divide(num,num1));}
			
		else {System.out.println("go home and sleep");
		}}

	public static int add(int num,int num1)	{
		return num+num1; 
	}
		
	public static int sub(int num,int num1)	{
		
		return num-num1;
		
	}
	public static int multiply(int num,int num1) {	
	return num*num1;
	}
public static int divide(int num,int num1)	{
	return num/num1;
	
	
}
}
