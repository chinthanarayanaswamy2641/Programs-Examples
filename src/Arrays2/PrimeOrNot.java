package Arrays2;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean isPrime=true;
		if(num>1) {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					isPrime=false;
				}
			}
		}else {
			isPrime=false;
		}
		if(isPrime) {
			System.out.println("given number "+num+" is a prime number");
		}else {
			System.out.println("given number "+num+" is not a prime number");
		}

	}

}
