
public class K {

	public static void main(String[] args) {
		String str="This Is Cns Hera";
		//Siht Si Snc Ereh
		String[]words=str.split(" ");
		String output="";

		for(String word:words) {
		char c=word.charAt(word.length()-1);
		char ch=word.charAt(0);
		char cg=(char)(ch+32); 
		String lastChar=String.valueOf(cg);
			char ca=(char)(c-32);
			String firstChar=String.valueOf(ca);
			for(int i=word.length()-2;i>=0;i--){
				if(i==word.charAt(0)) {
					lastChar=lastChar+word.charAt(i);
				}
				firstChar=firstChar+word.charAt(i);
				
			}
		output=output+firstChar+" ";
		}
		System.out.print(output+" ");		
	}

}
