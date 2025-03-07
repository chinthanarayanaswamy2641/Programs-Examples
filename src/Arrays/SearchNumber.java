package Arrays;

import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]= {12,34,56,98,95,78,89};
		int searchNumber=sc.nextInt();
		boolean isFound=false;
		for(int i=0;i<a.length;i++) {
		if(a[i]==searchNumber) {
			isFound=true;
			System.out.println(searchNumber+" is found at the index "+i);
			
		}
		}
		
		if(!isFound) {
			System.out.println(searchNumber+" is not found at the index");
	
		}
	}

}

