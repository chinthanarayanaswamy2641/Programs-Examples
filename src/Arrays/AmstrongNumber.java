package Arrays;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int number=num;
		int cubedNumber=0;
		while(num!=0) {
			int reminder=num%10;
			cubedNumber=cubedNumber+(reminder*reminder*reminder);
			num=num/10;
		}
		if(number==cubedNumber) {
			System.out.println("given number "+number+" is a amstrong number");
		}else {
			System.out.println("given number "+number+" is not a amstrong number");
		}

	}

}
