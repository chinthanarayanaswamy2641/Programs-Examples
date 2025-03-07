package aastring;

public class A {

	public static void main(String[] args) {
		String str="narayanaswamy";
		char[]ca=str.toCharArray();
		for(int i=0;i<ca.length;i++) {
			boolean isDuplicates=false;
			for(int j=i+1;j<ca.length;j++) {
				if(ca[i]==ca[j]) {
					isDuplicates=true;
				}
			}
			boolean isAlreadyPrinted=false;
			for(int k=0;k<i;k++) {
				if(ca[i]==ca[k]) {
					isAlreadyPrinted=true;
				}
			}
			if(isDuplicates && !isAlreadyPrinted) {
				System.out.println(ca[i]);
			}
		}

	}

}
