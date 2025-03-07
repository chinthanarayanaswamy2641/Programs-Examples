package Arrays3;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		int f=0;
		System.out.println(a+" ");
		System.out.println(b+" ");
		while(f<=n) {
			f=a+b;
			
			if(f>n) {
				break;
			}
			a=b;
			b=f;
			System.out.println(f+" ");
			
	}
		
	}

}
