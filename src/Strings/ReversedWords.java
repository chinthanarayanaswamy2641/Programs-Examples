package Strings;

public class ReversedWords {

	public static void main(String[] args) {
		String str="Varun Vaishnav Bhuvi";

	
		String[]words=str.split(" ");
		String reversedWord="";
		
			for(int i=words.length-1;i>=0;i--) {
			
				reversedWord=reversedWord+words[i]+" ";
				 
		}

			System.out.println(reversedWord);
	}

}

