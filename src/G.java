
public class G {

	public static void main(String[] args) {
		
				 String input = "A2B3C1";
				 char[]ca=input.toCharArray();
				    String output = "";

				    // Loop through the string
				    for (int i = 0; i < ca.length; i++) {
				       char c=ca[i];
				        i++; // Move to the number
				        int count = input.charAt(i) - '0'; // Convert char digit to integer

				      
				        for (int j = 0; j < count; j++) {
				            output += c; // Append the letter
				        }
				    }

				    
				    System.out.println(output);
	}

}
