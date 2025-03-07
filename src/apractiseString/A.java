package apractiseString;

import java.util.HashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) {
		String[]str= {"bhuvi","cns","varun","vaishnav","bhuvi","bhuvi","cns","thanvi"};
		System.out.print("{");
		boolean firstElementPrinted=false;
		for(int i=0;i<str.length;i++) {
			boolean alreadyPrinted=false;
			for(int j=0;j<i;j++) {
				
				if(str[i]==str[j]) {
					alreadyPrinted=true;
				}
			}
			if(!alreadyPrinted) {
				if(firstElementPrinted) {
					System.out.print(",");
				}
				System.out.print(str[i]+" ");
				firstElementPrinted=true;
			}
		}
		System.out.print("}");
	}
}
