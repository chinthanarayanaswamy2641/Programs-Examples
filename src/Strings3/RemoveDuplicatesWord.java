package Strings3;

public class RemoveDuplicatesWord {

	public static void main(String[] args) {
		String str="thanvi bhuvi varun vaishnav bhuvi varun";
		String[]words=str.split(" ");
		String duplicates="";
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(!words[i].equals(words[j]) && !duplicates.contains(words[i])){
					duplicates=duplicates+words[i]+" ";
				}
			}
		}
		System.out.println(duplicates);
	}

}
