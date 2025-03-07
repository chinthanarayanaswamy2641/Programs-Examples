package Strings4;

public class PrintEvenLengthWord {

	public static void main(String[] args) {
		String str="thanvi bhuvi varun vaishnav bhuna";;
		String[]words=str.split(" ");
		for(String word:words) {
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}

	}

}
