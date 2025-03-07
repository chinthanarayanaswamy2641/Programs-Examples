package Arrays2;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=100;i++) {
			boolean isPrime=true;
			if(i>1) {
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						isPrime=false;
					}
				}
			}else {
				isPrime=false;
			}
			if(isPrime) {
				System.out.println(i);
			}
		}

	}

}
