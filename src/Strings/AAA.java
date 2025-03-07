package Strings;

import java.util.Scanner;

//import java.util.Scanner;

//import java.util.Scanner;

//import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="varun vaishanv bhuvi";
		String finalStatement="";
		String[]words=str.split(" ");
		for(String word:words) {
			String reversedWord="";
			for(int i=word.length()-1;i>=0;i--) {
				reversedWord=reversedWord+word.charAt(i);
			}
			finalStatement=finalStatement+reversedWord+" ";
		}	
		System.out.println(finalStatement);
	}
	}
