package Strings4;

public class AddCharacterWhateverUWant {

	public static void main(String[] args) {
		String str = "GeekForGeeks"; 
        char ca = 's'; 
        int index = 3; 
        String string2="";
        
        for (int i = 0; i < str.length(); i++) {  
        	string2 =string2+str.charAt(i); // 
        	/*
        	 * G
        	 * Ge
        	 * Gee            
        	 * Geek
        	 * GeeksForGeeks
        	 */

            if (i == index) { 
  
                // Insert the string to be inserted 
                // into the new string 
            	string2 =string2+ ca; 
            	
            } 
          
        } 
  
        System.out.println(string2);


	}

}
