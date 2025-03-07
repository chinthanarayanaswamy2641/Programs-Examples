package Arrays;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int number=num;
		int reversedNumber=0;
		while(num!=0) {
			int reminder=num%10;
			reversedNumber=(reversedNumber*10)+reminder;
			num=num/10;
		}
		if(number==reversedNumber) {
			System.out.println("given number "+number+" is a palindrom number");
		}else {
			System.out.println("given number "+number+" is not a palindrome number");
		}
	}

}
