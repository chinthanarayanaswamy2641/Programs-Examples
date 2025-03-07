package Strings5;

public class PrintCapitalLetterWateverUWant {

	public static void main(String[] args) {
		String str="narayanaswamy";
		char[]ca=str.toCharArray();
			char c=ca[8];
		//	char capital=Character.valueOf(c).toUpperCase(c);
			String myString = String.valueOf(c).toUpperCase();
			for(int i=0;i<8;i++) {
				          
				System.out.print(ca[i]);
				
			}
			for(int j=9;j<ca.length;j++) {
				myString=myString+ca[j];
			}
		System.out.println(myString);

	}

}
