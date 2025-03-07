package aastring;

public class B {

	public static void main(String[] args) {
	String str="narayanaswamy";
	char[]ca=str.toCharArray();
	for(int i=0;i<ca.length;i++) {
		int count=0;
		boolean isDuplicated=false;
		for(int j=i+1;j<ca.length;j++) {
			if(ca[i]==ca[j]) {
				isDuplicated=true;
				count++;
			}
		}
		boolean isAlreadyPrinted=false;
		for(int k=0;k<i;k++) {
			if(ca[i]==ca[k]) {
				isAlreadyPrinted=true;
			}
		}
		if(isDuplicated && !isAlreadyPrinted) {
			System.out.println(ca[i]+""+count);
		}
	}

	}

}
