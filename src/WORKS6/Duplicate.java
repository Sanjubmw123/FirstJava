package WORKS6;

import java.util.Scanner;

public class Duplicate {
	//Ask the USER for a string (let’s assume they input “hello world”):
	//	a.	Find and Print the Duplicated Character (it should print: l o)
	public static void main(String[] args) {
		Scanner abc=new Scanner (System.in);
		System.out.println("what is your string man?");
		String xyz =abc.next();
		
		
		
     char[] ch=xyz.toCharArray();			int count=0;
	for(int i=0;i<xyz.length();i++) { 
		for(int j=i+1;j<xyz.length();j++) {
		if (ch[i]==ch[j]) {
			System.out.println(ch[j]);
		
			count++;
			break;
			}
		

	}

}}}
