package Arrays;

import java.util.Scanner;

public class Print_Spaces_Letters_Numbers_Others {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="2absdsdj2sdlkl2dkskasd222bghff2";
		char[]ca=str.toCharArray();
		int letters=0;
		int digits=0;
		int spaces=0;
		int others=0;
		for(Character c:ca) {
			if(c>='a' && c<='z' || c>='A' && c<='Z') {
				letters++;
			}else if(c>='0' && c<='9' ) {
				digits++;
			}else if(c==' ') {
				spaces++;
			}else {
				others++;
			}
		}
		System.out.println("the total number of digits "+digits);
	System.out.println("the total number of letters "+letters);
	System.out.println("the total number of spaces "+spaces);
  System.out.println("the total number of other characters "+others);
	}

}
