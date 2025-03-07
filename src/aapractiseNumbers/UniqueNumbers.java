package aapractiseNumbers;

public class UniqueNumbers {

	public static void main(String[] args) {
		String str="narayanaswamy";
		char[]ca=str.toCharArray();
		for(int i=0;i<ca.length;i++) {
			int count=0;
			boolean alredyPrinted=false;
			for(int j=0;j<i;j++) {
				if(ca[i]==ca[j]) {
					alredyPrinted=true;
					count++;
				}
			}
			if(!alredyPrinted) {
				System.out.print(ca[i]);
			}
		}
	}

}