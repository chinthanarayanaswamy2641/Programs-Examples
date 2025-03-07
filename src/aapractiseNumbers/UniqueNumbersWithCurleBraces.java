package aapractiseNumbers;

public class UniqueNumbersWithCurleBraces {

	public static void main(String[] args) {
		int a[]= {9,3,4,6,3,6,6,8,9,8};
		System.out.print("{");
		boolean firstElementPrinted=false;
		for(int i=0;i<a.length;i++) {
			boolean alreadyPrinted=false;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					alreadyPrinted=true;
				}
			}
			if(!alreadyPrinted) {
				if(firstElementPrinted) {
					System.out.print(",");
				}
				System.out.print(a[i]);
				firstElementPrinted=true;
			}
		}
System.out.println("}");
	}

}
