package Strings5;

public class PrintCapitalLetterWhateverUWantInString {

	public static void main(String[] args) {
		String str="thanvi bhuvi varun vaishnav";
		String[]words=str.split(" ");
		for(String word:words) {
			char[]ca=word.toCharArray();
			char c=ca[2];
//			char CapitalLetter=Character.valueOf(c).toUpperCase(c);
//			String thirdLetterCapital=Character.toString(CapitalLetter);
			String thirdLetterCapital=String.valueOf(c).toUpperCase();
			for(int i=0;i<2;i++) {
				System.out.print(ca[i]);
			}
			for(int j=3;j<ca.length;j++) {
				thirdLetterCapital=thirdLetterCapital+ca[j];
			}
			System.out.print(thirdLetterCapital+" ");
		}

	}

}
