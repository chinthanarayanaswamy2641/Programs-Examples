package stars;

public class A {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			int alphabete=65;
			for(int j=4;j>=0;j--) {
			
			if(j<=i) {
				System.out.print((char)alphabete+++" ");
			}else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}

	}

}

//   A 
//  A B 
// A B C 
//A B C D 
//A B C D E 
