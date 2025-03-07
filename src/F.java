
public class F {

	public static void main(String[] args) {
		
		String s = "abcabcbb";

        // Find the length of the longest unique substring
        int maxLength = findLongestUniqueSubstring(s);

        // Print the result
        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);
    }

    public static int findLongestUniqueSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        char[] chars = s.toCharArray();

        // Outer loop to traverse the string
        for (int i = 0; i < chars.length; i++) {
            for (int j = start; j < i; j++) {
                // If a repeating character is found, move the start pointer
                if (chars[i] == chars[j]) {
                    start = j + 1;
                    break;
                }
            }
            // Update the max length of the unique substring
            int currentLength = i - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
	}
}
//abcabcbb