package Strings4;

public class InsertAStringInJava {
	public static void main(String[] args) {
		String str = "GeeksGeeks"; 
        String stringToBeInserted = "For"; 
        int index = 4; 
        String string2="";
        for (int i = 0; i < str.length(); i++) {  
        	string2 =string2+str.charAt(i); 
        	/*
        	 * G 
        	 * Ge 
        	 * Gee             
        	 * Geek
        	 * Geeks 
        	 * GeeksFor 
        	 * GeeksForG
        	 * GeeksForGe
        	 * GeeksForGee
        	 * GeeksForGeek
        	 * GeeksForGeeks 
        	 */
            if (i == index) { 
                // Insert the string to be inserted 
                // into the new string 
            	string2 =string2+ stringToBeInserted; 
            } 
        } 
        System.out.println(string2);
	}
}
