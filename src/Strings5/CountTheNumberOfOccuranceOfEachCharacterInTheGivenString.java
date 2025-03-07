package Strings5;

public class CountTheNumberOfOccuranceOfEachCharacterInTheGivenString {

	public static void main(String[] args) {
		String str="geeksforgeeks";
		 char[]ca=str.toCharArray();
		 int count=0;
		 char c='e';
		 for(int i=0;i<ca.length;i++) {
		 if(c==ca[i]) {
			count++;
		   }
		 }
			System.out.println("the number of character "+ c +" in the string is: "+count);

	}

}
