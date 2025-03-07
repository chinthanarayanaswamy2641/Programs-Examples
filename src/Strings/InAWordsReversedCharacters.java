package Strings;

public class InAWordsReversedCharacters {

	public static void main(String[] args) {
		String str="Varun Vaishnav Bhuvi";
		String[]words=str.split(" ");
		String finalStatement="";
		for(String word:words) {
			String reversedString="";
			for(int i=word.length()-1;i>=0;i--) {
				reversedString=reversedString+word.charAt(i);
			}
			finalStatement=finalStatement+reversedString+" ";
		}
            System.out.println(finalStatement);
	}

}

//output: nuraV vanhsiaV ivuhB   