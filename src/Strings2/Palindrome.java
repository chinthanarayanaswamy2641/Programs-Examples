package Strings2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		
		String reversedString="";
		char[]ca=string.toCharArray();
		for(int i=ca.length-1;i>=0;i--) {
			reversedString=reversedString+ca[i];
		}
		
           if(string.equals(reversedString)) {
        	   System.out.println("given string "+string+" is a palindrome");
           }else {
        	   System.out.println("given string "+string+" is not a palindrome");
           }
	}

}
