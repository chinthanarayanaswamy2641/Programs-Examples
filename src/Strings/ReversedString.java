package Strings;

public class ReversedString {

	public static void main(String[] args) {
		String str="Narayanaswamy";
		char[]ca=str.toCharArray();
		String reversedString="";
		for(int i=ca.length-1;i>=0;i--) {
			reversedString=reversedString+ca[i];
		}
		System.out.println(reversedString);
	}

}


// output: ymawsanayaraN