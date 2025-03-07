package Strings5;

public class PrintFirstLetterIsCapitalInAString {

	public static void main(String[] args) {
		String str="narayanaswamy";
		char[]ca=str.toCharArray();
			char c=ca[0];
			//char firstChar=Character.valueOf(c).toUpperCase(c);
//			String myString = String.valueOf(firstChar);
			String firstChar= String.valueOf(c).toUpperCase();
			String myString=firstChar;
			for(int i=1;i<ca.length;i++) {
				          
				myString=myString+ca[i];
				
			}
		System.out.println(myString);
	}

}
