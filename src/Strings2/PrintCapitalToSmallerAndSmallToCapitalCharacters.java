package Strings2;

public class PrintCapitalToSmallerAndSmallToCapitalCharacters {

	public static void main(String[] args) {
		String str="Narayana Swamy";
		char[]ca=str.toCharArray();
		String res="";
		for(Character c:ca) {
			if(Character.isUpperCase(c)) {
				res=res+Character.toLowerCase(c);
				
			}else {
				res=res+Character.toUpperCase(c);
			}
		}
	System.out.println(res);
	}

}
