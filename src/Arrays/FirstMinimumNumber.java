package Arrays;

public class FirstMinimumNumber {

	public static void main(String[] args) {
		int a[]= {98,23,45,64,65,31,99,58,35};
		int fmin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<fmin) {
				fmin=a[i];
			}
		}
         System.out.println(fmin);

	}

}
