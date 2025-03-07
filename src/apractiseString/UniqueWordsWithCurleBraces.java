package apractiseString;

public class UniqueWordsWithCurleBraces {

	public static void main(String[] args) {
		String []words= {"bhuvi","varun","vaishnav","thanvi","bhuvi","vaishnav"};
		boolean firstWordPrinted=false;
		System.out.print("{");
		for(int i=0;i<words.length;i++) {
			boolean wordprinted=false;
			for(int j=0;j<i;j++) {
				if(words[i]==words[j]) {
					wordprinted=true;
				}
			}
			if(!wordprinted) {
				if(firstWordPrinted) {
					System.out.print(",");
				}
				System.out.print(words[i]);
				firstWordPrinted=true;
			}
		}
		System.out.println("}");

	}

}
