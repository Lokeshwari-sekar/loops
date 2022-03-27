package com.assignment1;

public class Switchcase {

	public static void main(String[] args) {
		char input='#';
		int ascii=(input);
		int val=ascii;
		System.out.println("Given input value is "+input);
		System.out.println(val);
		if((47<val)&&(val<58))
		{
			System.out.println("Given value is number");
		}
		else if(((val>64)||(val<89))&&((val>94)||(val<121)))
		{
			System.out.println("Given value is alphabet");
		}
		else
		{
		System.out.println("Given value is special character");
		}
		
	}
}

