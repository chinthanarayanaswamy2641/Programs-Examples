package Arrays;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="CloudTech";
		char[]ca=str.toCharArray();
		String outpt="";
		for(Character c:ca) {
			 if(c=='C' || c=='c') {
				 continue;
			 }
			 outpt=outpt+c;
		}
		System.out.println(outpt);
	}

}
