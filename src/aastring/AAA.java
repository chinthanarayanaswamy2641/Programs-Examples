package aastring;

public class AAA {

	public static void main(String[] args) {
		String str="narayanaswnamy";
		char[]ca=str.toCharArray();
		for(int i=0;i<ca.length;i++) {
			int count=0;
			boolean isAlreadyPrinted=false;
			for(int j=0;j<i;j++) {
				if(ca[i]==ca[j]) {
					count++;
					isAlreadyPrinted=true;
					
				}
			}
			if(!isAlreadyPrinted) {
				
				System.out.print(ca[i]+""+count);
			}
		}
	}

}
