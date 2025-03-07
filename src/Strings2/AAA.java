package Strings2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String vowel="";
		char[]ca=str.toCharArray();
		for(Character c:ca) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				vowel=vowel+c;
			}
		}
		//System.out.println(vowel);
		String string=vowel;
		char[]ch=string.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(ch);
		}
}


