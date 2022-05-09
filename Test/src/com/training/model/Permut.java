package com.training.model;
import java.util.*;

public class Permut {
	public static void permutation(String name,String out)
	{
		if(name.length()==0) {
			System.out.println(out+" ");
	
		}
			
		
			for(int i=0;i<name.length();i++) {
				char per=name.charAt(i);
				String rest=name.substring(0,i)+name.substring(i+1);
				permutation(rest,out+per);
			}
			}
		
	
	public static void main(String[] args) {
	
    Scanner scanner = new Scanner(System.in);
		
	System.out.println("Enter any string ");
	String name = scanner.next();
	permutation(name, " ");
       
	

		
	}

	
	
}
