package Arrays2;

import java.util.Arrays;
import java.util.Scanner;

import Arrays3.PrintDuplicates;

public class AAA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		
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

// 12345677
// 12345667
// 12345567
// 12344567
// 12334567
// 12234567
// 11234567
// 81234567