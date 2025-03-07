package Strings2;

import java.util.Scanner;

public class CountVowelsAndAlphabeticalOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[]words= {"she123","is234","down345","the456","line567"};
		String vowels="";
		for(String word:words) {
			
	    	char[]ca=word.toCharArray();
	    	for(Character c:ca) {
	    	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
	    		
	    		vowels=vowels+c;
	    	}
	    	
	    }
	    	
		}
		//System.out.println(vowels);
		String res=vowels;
		char[]ca=res.toCharArray();
		for(int i=0;i<ca.length;i++) {
			for(int j=i+1;j<ca.length;j++) {
				if(ca[i]>ca[j]) {
					char temp=ca[i];
					ca[i]=ca[j];
					ca[j]=temp;
				}
			}
		}
		System.out.println(ca);

	}

}
