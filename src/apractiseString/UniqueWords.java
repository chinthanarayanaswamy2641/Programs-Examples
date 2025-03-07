package apractiseString;

public class UniqueWords {

	public static void main(String[] args) {
		String []words= {"bhuvi","varun","vaishnav","thanvi","bhuvi","vaishnav","bhuvi"};
		for(int i=0;i<words.length;i++) {
			boolean wordPrinted=false;
			for(int j=0;j<i;j++) {
				if(words[i]==words[j]) {
					wordPrinted=true;
				}
			}
			if(!wordPrinted) {
				System.out.print(words[i]+" ");
			}
		}

	}

}
