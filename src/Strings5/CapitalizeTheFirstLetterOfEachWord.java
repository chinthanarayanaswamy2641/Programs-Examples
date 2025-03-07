package Strings5;

public class CapitalizeTheFirstLetterOfEachWord {

	public static void main(String[] args) {
		String str="thanvi bhuvi varun vaishnav";
		String[]words=str.split(" ");
		//String finalString="";
		for(String word:words) {
			char[]ca=word.toCharArray();
			char c=ca[0];
			String firstChar=String.valueOf(c).toUpperCase();
	     String capitalizeLetter=firstChar;
		for(int i=1;i<ca.length;i++) {
			capitalizeLetter=capitalizeLetter+ca[i];
		}
		System.out.print(capitalizeLetter+" ");
		}
		

	}

}
