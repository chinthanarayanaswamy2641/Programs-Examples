package Arrays;

import java.util.Scanner;

public class SwappingNumbersInAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {20,30,50,10,25,35,75,85,45};
		int temp;
		
		temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}

	}

}
