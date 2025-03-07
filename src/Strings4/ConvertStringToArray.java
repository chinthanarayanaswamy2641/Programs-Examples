package Strings4;

public class ConvertStringToArray {

	public static void main(String[] args) {
		String str = "Geeks For Geeks"; 
	       String[]words=str.split(" ");
	       System.out.print("[");
	       for(int i=0;i<words.length;i++) {
	    	   System.out.print(words[i]+" ");
	       }
	         
	       System.out.print("]");
	}

}
