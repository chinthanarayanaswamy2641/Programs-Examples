package Strings2;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="This Is CloudTech This Is CloudTech";
		String[]words=str.split(" ");
		int count=0;
		for(String word:words) {
			char[]ca=word.toCharArray();
			for(int i=0;i<words.length;i++) {
				for(int j=0;j<words.length;j++) {
					if(words[i].equals(words[j])) {
						count++;
					
						if(count==1) {
							if(ca[i]>='A' && ca[i]<='Z') {
							ca[i]=(char)(ca[i]+32);
						}
						}else if(count==2) {
							if(ca[i]>='a' && ca[i]<='z') {
							ca[i]=(char)(ca[i]-32);
						}
					}
			}
				}
			}
		
			System.out.println(ca);
	
		}
		}
		}
	



