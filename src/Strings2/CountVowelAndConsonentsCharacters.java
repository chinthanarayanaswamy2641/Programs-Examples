package Strings2;

public class CountVowelAndConsonentsCharacters {

	public static void main(String[] args) {
		String str="Vaishnavrio";
		char[]ca=str.toCharArray();
		String vowel="";
		for(Character ch:ca) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch =='E' || ch== 'I' || ch=='O' || ch=='U') {
				vowel=vowel+ch;
		}
	}
//		String string =vowel;
//		char[]s=string.toCharArray();
//		for(int i=0;i<s.length;i++) {
//			for(int j=i+1;j<s.length;j++) {
//				if(s[i]>s[j]) {
//					char temp=s[i];
//					s[i]=s[j];
//					s[j]=temp;
//				}
//			}
//		}
System.out.println(vowel);
}
}
		
	
