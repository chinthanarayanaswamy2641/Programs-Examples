package Arrays2;

import java.util.Scanner;

public class PrintPrimeNumbersTakingInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
         for(int e:a) {
        	 boolean isPrime=true;
        	 if(e>1) {
        		 for(int i=2;i<e;i++) {
        			 if(e%i==0) {
        				 isPrime=false;
        			 }
        		 }
        	 }else {
        		 isPrime=false;
        	 }
        	 if(isPrime) {
        		 System.out.println(e);
        	 }
         }
	}

}
