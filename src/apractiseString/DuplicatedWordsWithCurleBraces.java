package apractiseString;

public class DuplicatedWordsWithCurleBraces {

	public static void main(String[] args) {
		String[]str= {"bhuvi","cns","varun","vaishnav","bhuvi","bhuvi","cns"};
		boolean firstElementPrinted=false;
		System.out.print("{");
		for(int i=0;i<str.length;i++) {
			boolean isDuplicated=false;
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					isDuplicated=true;
					break;
				}
			}
			boolean alreadyPrinted=false;
			for(int k=0;k<i;k++) {
				if(str[i]==str[k]) {
					alreadyPrinted=true;
					break;
				}
			}
			if(isDuplicated && !alreadyPrinted) {
				if(firstElementPrinted) {
					System.out.print(",");
				}
				System.out.print("\""+str[i]+"\"");
				firstElementPrinted=true;
			}
		}
		System.out.println("}");

	}

}
