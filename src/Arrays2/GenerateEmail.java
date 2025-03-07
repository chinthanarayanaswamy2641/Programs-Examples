
package Arrays2;

import java.util.Scanner;

public class GenerateEmail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s.matches("[a-zA-Z0-9]+@gmail[.]com"));
	}

}
