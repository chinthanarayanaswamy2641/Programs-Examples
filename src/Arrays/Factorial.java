package Arrays;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	int num=sc.nextInt();
//	int fact=Factorial(num);
//	System.out.println(fact);
//
//	}
//  public static int Factorial(int n) {
//	  if(n==0) {
//		  return 1;
//	  }else {
//		  return n*Factorial(n-1);
//	  }
	int num=5;
	int fact=1;
	for(int i=1;i<=5;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
  }
}
