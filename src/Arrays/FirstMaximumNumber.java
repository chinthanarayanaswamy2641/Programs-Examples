package Arrays;

public class FirstMaximumNumber {

	public static void main(String[] args) {
		int a[]= {100,23,45,64,65,31,99,58,35};
		int fmax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				fmax=a[i];
			}
		}
         System.out.println(fmax);
	}

}
