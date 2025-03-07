package aapractiseNumbers;

public class A {

	public static void main(String[] args) {
		int a[]= {9,3,4,6,3,6,6,8,9,8};
		for(int i=0;i<a.length;i++) {
			boolean duplicated=false;
			for(int j=i+1;j<a.length;j++) {
				 if(a[i]==a[j]) {
					 duplicated=true;
					 break;
				 }
			}
			boolean isAlreadyPrinted=false;
			for(int k=0;k<i;k++) {
				if(a[i]==a[k]) {
				isAlreadyPrinted=true;
				break;
				}
			}
			if(duplicated && !isAlreadyPrinted) {
				System.out.println(a[i]);
			}
		}
		
	}
}
	// narayana