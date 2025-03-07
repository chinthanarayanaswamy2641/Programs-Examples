package Arrays2;

import java.util.Arrays;
import java.util.Scanner;

import Arrays3.PrintDuplicates;

public class RotationOfArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int n=3;
		for(int j=1;j<=3;j++) {
			int last= a[a.length-1];
			for(int i=a.length-1;i>0;i--) {
				a[i]=a[i-1];
			}
			a[0]=last;
			
		}
		System.out.println(Arrays.toString(a));
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