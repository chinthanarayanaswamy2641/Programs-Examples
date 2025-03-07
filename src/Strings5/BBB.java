package Strings5;

public class BBB {

	public static void main(String[] args) {
       String input = "abhi arun varun bhuvi bhavi";
        
        // Split the string into an array of words
        String[] words = input.split(" ");
        
        // Sort the array of words using bubble sort
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    // Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        
        // Print the sorted array
        for (String word : words) {
            System.out.print(word + " ");
        }
	}

}
