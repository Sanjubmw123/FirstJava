package WORKS3;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		
		Scanner abc=new Scanner(System.in);
		int n=abc.nextInt();
		// given n print n:1 4 8 12 16 20
//		for(int i=0;i<=n;i=i+4) {
//          if (i==0) {
//        	  System.out.print(1);}
//        	  else {
//        		  System.out.print(i);
//        	  }
//          }
		
	//	Given N --- Print backward to 0. 	
		
		for(int i=n;i>=0;i--) {
		System.out.print( i  + "\t");
	}

	}}
