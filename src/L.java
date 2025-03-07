
public class L {

	public static void main(String[] args) {
//		String str="This";
//		String output="";
//			char[]ca=str.toCharArray();
//			for(int i=0;i<ca.length;i++) {
//				if(ca[i]>='A' && ca[i]<='Z') {
//					 ca[i]=(char)(ca[i]+32);
//				}
//				
//			}
//			char c=ca[ca.length-1];
//			//System.out.println(c);
//			char ch=(char)(c-32);
//			String firstChar=String.valueOf(ch);
//			//System.out.println(firstChar);
//			for(int i=ca.length-2;i>=0;i--) {
//				firstChar=firstChar+ca[i];
//			}
//			//output=output+firstChar;
//			System.out.println(firstChar);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String str="This";
		char[]ca=str.toCharArray();
		String output="";
		for(int i=0;i<ca.length;i++) {
			if(ca[i]>='A' && ca[i]<='Z') {
				ca[i]=(char)(ca[i]+32);
			}	
		}
		//System.out.println(ca);
		char c=ca[ca.length-1];
		c=(char)(c-32);
		//System.out.println(c);
		String firstChar=String.valueOf(c);
		for(int i=ca.length-2;i>=0;i--) {
			firstChar=firstChar+ca[i];
		}
		output=output+firstChar;
		System.out.println(output);
		}
}











