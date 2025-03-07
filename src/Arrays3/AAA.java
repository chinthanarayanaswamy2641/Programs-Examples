package Arrays3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int f=0;
		while(f<=num) {
			f=a+b;
			if(f>num) {
				break;
			}
			System.out.println(f+" ");
			a=b;
			b=f;
		}
		}
		}
	
