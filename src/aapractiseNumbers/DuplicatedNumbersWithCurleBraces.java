package aapractiseNumbers;

public class DuplicatedNumbersWithCurleBraces {

	public static void main(String[] args) {
		int a[]= {9,3,4,6,3,6,6,8,9,8};
		boolean firstElementPrinted=false;
		System.out.print("{");
		for(int i=0;i<a.length;i++) {
			boolean isDuplicated=false;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					isDuplicated=true;
				}
			}
			boolean alreadyPrinted=false;
			for(int k=0;k<i;k++) {
				if(a[i]==a[k]) {
					alreadyPrinted=true;
				}
			}
			if(isDuplicated && !alreadyPrinted) {
				if(firstElementPrinted) {
					System.out.print(",");
				}
				System.out.print(a[i]);
				firstElementPrinted=true;
			}
		}
		System.out.print("}");

	}

}
