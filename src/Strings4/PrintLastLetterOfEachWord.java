package Strings4;

public class PrintLastLetterOfEachWord {

	public static void main(String[] args) {
		String str="Made In Andhra Student Ante";
		String[]words=str.split(" ");
		for(String word:words) {
			for(int i=word.length()-1;i>=0;i--) {
				System.out.print(word.charAt(i));
				break;
			}
		}
	}

}
