package Arrays;

public class SecondMaximumNumber {

	public static void main(String[] args) {
		int a[]= {102,98,23,45,64,65,31,99,58,35,101};
		int fmax=a[0];
		int smax=a[1];
		for(int i=0;i<a.length;i++) {
		if(a[i]>fmax) {
			smax=fmax;
			fmax=a[i];
		    }
		else if(a[i]>smax && a[i]!=fmax) {
	         smax=a[i];
		}
		}
		System.out.println(smax);
	}
}

