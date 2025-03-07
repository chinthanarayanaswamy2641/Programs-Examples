package Arrays2;

public class PrintPrimeNumbersInAnArray {

	public static void main(String[] args) {
		int num[]= {5,7,9,11,35,37,39,41,43,48,51};
		int sum=0;
		for(int e:num) {
			boolean isPrime=true;
		if(e>1) {
		 for(int j=2;j<e;j++) {
			
				if(e%j==0) {
					isPrime=false;
					 }
				}
				
			
			
		}else {
			isPrime=false;
		}
	
		if(isPrime) {
			System.out.println(e);
			sum=sum+e;
		}
		}
		System.out.println("sum is: "+sum);
	}

}
