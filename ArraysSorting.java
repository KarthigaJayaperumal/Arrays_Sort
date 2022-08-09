package hello.anyone;

import java.util.Arrays;

public class ArraysSorting {

	public static void main(String[] args) {
	int ar[]= {5,1,6,7,2,3};
	System.out.println("Before Sorting ");
	for(int af:ar) {
		System.out.print(af+" ");
	}System.out.println();
Arrays.sort(ar);
System.out.println("After Sorting ");
for(int as:ar)
System.out.print(as+" ");
	
	String names[]= {"Karthi","Aji","Muthu"};
	System.out.println("Before Sorting ");
	for(String fg:names) {
		System.out.print(fg+" ");
	}System.out.println();
	Arrays.sort(names);
	System.out.println("After Sorting"+" ");
	for(String fg:names) {
		System.out.print(fg+" ");
	}

}}
