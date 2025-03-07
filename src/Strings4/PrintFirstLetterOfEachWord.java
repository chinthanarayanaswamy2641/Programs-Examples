package Strings4;

public class PrintFirstLetterOfEachWord {

	public static void main(String[] args) {
		String str="Made In Andhra Student Ante";
		String[]words=str.split(" ");
		for(String word:words) {
			for(int i=0;i<word.length();i++) {
				System.out.print(word.charAt(i));
				break;
			}
		}
	}

}
