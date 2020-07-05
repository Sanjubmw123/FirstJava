package WORKS6;

import java.util.Set;
import java.util.TreeSet;
  //Create a Int Array[] with unsorted numbers and sort 
  //without using Arrays.sort() function
public class Sorting {

	public static void main(String[] args) {
	Set<Integer> numsort=new TreeSet<Integer>();
	numsort.add(14);
	numsort.add(24);
	numsort.add(34);
	numsort.add(54);
	numsort.add(64);
	numsort.add(74);
	numsort.add(84);
	numsort.add(94);
	
	for(Integer i:numsort) {
  System.out.println(i);
  System.out.println(numsort.size());
	}
	}}

