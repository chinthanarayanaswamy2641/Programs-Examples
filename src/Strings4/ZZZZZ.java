package Strings4;

public class ZZZZZ {

	public static void main(String[] args) {
		String str="Thanvi Bhuvi Varu Vaishnav";
		String[]words=str.split(" ");

		int index=2;
		char c='n';
		String result="";
		String res="";
		for(int i=0;i<words.length;i++) {
			res=res+words[i]+" ";
			
			if(i==index) { 
		
			res=res+""+c+" ";
					
			}
			
			}
		 result=result+res;
		 System.out.println(result);

	}

}
