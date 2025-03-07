
public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="This Is Cns Hera";
       String[]words=str.split(" ");
      // String output="";
       for(String word:words) {
    	   String output="";
    	 char[]ca=word.toCharArray();
    	 for(int i=0;i<ca.length;i++) {
    		 if(ca[i]>='A' && ca[i]<='Z') {
    			 ca[i]=(char)(ca[i]+32);
    		 }
    	 }
    		char c=ca[ca.length-1];
    		c=(char)(c-32);
    		String firstChar=String.valueOf(c);
    		for(int j=ca.length-2;j>=0;j--) {
    			firstChar=firstChar+ca[j];
    		}
    		output=output+firstChar;
    		System.out.print(output+" ");
    	 }
    	 System.out.println();
       }
	
}
