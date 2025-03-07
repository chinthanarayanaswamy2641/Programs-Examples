package Strings2;

import java.util.Scanner;

public class Print_capital_to_small_small_to_capital {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char[]ca=str.toCharArray();
	for(int i=0;i<ca.length;i++) {
		if(ca[i]>='A' && ca[i]<='Z') {
			ca[i]=(char) (ca[i]+32);
		}else if(ca[i]>='a' && ca[i]<='z') {
			ca[i]=(char)(ca[i]-32);
		}
	}
	System.out.println(ca);
//str=new String(ca);
//System.out.println(str);
	}

}
