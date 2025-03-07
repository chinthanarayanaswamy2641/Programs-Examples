
public class E {

	public static void main(String[] args) {
		String s="abcabbdb";
		char[]ca=s.toCharArray();
		for(int i=0;i<ca.length;i++) {
			int count=0;
			 boolean isDuplicated=false;
			for(int j=0;j<ca.length;j++) {
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
				System.out.print(ca[i]+""+count);
			}
		}
     
	}

}
