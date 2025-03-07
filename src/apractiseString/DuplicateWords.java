package apractiseString;

public class DuplicateWords {

	public static void main(String[] args) {
		String str="bhuvi varun vaishnav abhi ram bhuvi abhi";
		String[]words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			boolean isDuplicated=false;
			int count=0;
			for(int j=0;j<words.length;j++) {
				
				if(words[i].equals(words[j])) {
					isDuplicated=true;
					count++;
				}
			}
			boolean alreadyPrinted=false;
			for(int k=0;k<i;k++) {
				if(words[i].equals(words[k])) {
				alreadyPrinted=true;
				}
			}
			if(isDuplicated && !alreadyPrinted) {
				System.out.println(words[i]+" "+count);
			}
		}

	}

}
