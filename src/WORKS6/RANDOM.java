package WORKS6;

import java.util.Random;

public class RANDOM {
 //Generate 500 RANDOM numbers, and find the Nth smallest number 
//	(range from 100 – 1000)
	 static int count=500;
	public static void main(String[] args) throws Exception {
		
		for(int i=0;i<=count;i++) {
			System.out.println("random num :" + getrandom(100,1000) );}
		}
public static int getrandom(int min,int max) throws Exception {
	if(min>=max) {
		throw new Exception("be happy");
	}
		Random r= new Random();
		System.out.println("smallest number is:" +min);
		return r.nextInt((max-min)+1) +min;
	}
}
	


