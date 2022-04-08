package com.training.services;

public class StringService {
	
	//stringequals method without using constructors
	public  void stringEquals(String str1,String str2) {
		System.out.println("its value same := " + str1.equals(str2));
		System.out.println("are they pointing to same location := "+(str1==str2));
	}
	
	//stringequals method using constructors
	public void stringobjectEquals() {
		String ram=new String("ram");
		String ramudu=new String("ram");
		System.out.println("its value same := " + ram.equals(ramudu));
		System.out.println("are they pointing to same location := "+(ram==ramudu));
	}
     
	public String usingTrim(String name) {
		System.out.println("without trim := "+name);
		System.out.println("Trim := "+name.trim());
		return name.trim();
		
	}
	
	public void lengthOfString(String name) {
		//String rep=usingTrim(name);
		
		//in order to get the trimmed string length
		System.out.println("String length := "+name.trim().length());
	}
	
	
	public void usingSubString(String name) {
		System.out.println(name.substring(3));
		System.out.println(name.substring(4,10));
	}
	
	public void usingCharAtAndIndexOf(String name) {
		System.out.println("index position of @ is := "+name.indexOf('@'));
		System.out.println("character at position 3 := "+name.charAt(3));
	}
	
	public void usingReplace(String name1,String name2) {
		System.out.println("after replacing := " +name1.replace("sh","ya"));
	}
	
	public void usingConcat(String str1,String str2) {
		System.out.println(str1.concat(str2));
	
	StringBuilder builder=new StringBuilder(str1);
	builder.append(str2);
	System.out.println(builder.toString());
	
	}
	
	public void usingCompareTo() {
		String comp1=new String("ram");
		String comp2=new String("ramya");
		System.out.println("compare := "+comp1.compareTo(comp2));
	}
	
	//the below method is referred to as overloaded method as same methods (usingStringFormat)
	//but different arguments
	public void usingStringFormat(String str1,double mark) {
		String frmtString=String.format("name is %s", str1);
		System.out.println(frmtString);
		System.out.println(String.format("mark %.2f",mark));
	}
	
	public void usingStringFormat(int mark) {
		System.out.println(String.format("octal %o", mark));
		System.out.println(String.format("hexadecimal %x", mark));
		}
	public void usingStringFormat(long value) {
		System.out.println(String.format("%d+", value));
	}
	
}
