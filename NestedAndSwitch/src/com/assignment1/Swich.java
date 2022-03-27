package com.assignment1;

public class Swich {

	public static void main(String[] args) {
		char input='~';
		switch(input)
		{
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':	
		{
			System.out.println("the value is integer");
			break;
		}
		case 'A':
		case 'B':
		case 'C':
		{
			System.out.println("the value is Alphabets");
			break;
		}
		case '*':
		case '%':
		case '#':
		case '!':
		case '@':
		case '$':
		case '^':
		case '&':
		case '(':
		case ')':
		case '~':
		case '`':
		case '/':
		{
			System.out.println("the value is special character");
			break;
		}
		default:
			System.out.println("the value is invalid");
			break;
			

		}

	}}
