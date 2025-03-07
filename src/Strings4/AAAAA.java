package Strings4;

public class AAAAA {

	public static void main(String[] args) {
		String str="narayanaswamy";
			char[]ca=str.toCharArray();
			char c=ca[0];
			String capital=String.valueOf(c).toUpperCase();
			for(int i=1;i<ca.length;i++) {
				capital=capital+ca[i];
			}
			System.out.println(capital);
	}
}

