package Arrays;

public class SecondMinimumNumber {

	public static void main(String[] args) {
		int a[]= {10,98,23,45,64,65,31,99,58,35,5};
		int fmin=a[0];
		int smin=a[1];
		for(int i=0;i<a.length;i++) {
		if(a[i]<fmin) {
			smin=fmin;
			fmin=a[i];
		    }
		 
		else if(a[i]<smin && a[i]!=fmin) {
	         smin=a[i];
		}
		}
		System.out.println(smin);


	}

}
