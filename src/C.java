
public class C {

	public static void main(String[] args) {
	String str="programming is fun";
	String[]words=str.split(" ");
	for(String word:words) {
		char[]ca=word.toCharArray();
		
		String data="";
		for(Character c:ca) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				continue;
			}
			data=data+c;
		}
		//System.out.println(data);
		String output=data;
		
			char[]ch=output.toCharArray(); 
			 char cr=ch[0];
			String firstChar=String.valueOf(cr).toUpperCase();
			String input=firstChar;
			for(int i=1;i<output.length();i++) {
				input=input+ch[i];
			}
			System.out.print(input+" ");
		}
		
		
		
	
	}
}