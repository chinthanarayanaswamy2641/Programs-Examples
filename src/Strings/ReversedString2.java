package Strings;

public class ReversedString2 {

	public static void main(String[] args) {
		String str="Varun Vaishnav Bhuvi";
		char[]ca=str.toCharArray();
		String reversedString="";
		for(int i=ca.length-1;i>=0;i--) {
			reversedString=reversedString+ca[i];
		}
		System.out.println(reversedString);
	}

}


//output: ivuhB vanhsiaV nuraV