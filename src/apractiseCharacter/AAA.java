package apractiseCharacter;

public class AAA {

	public static void main(String[] args) {
		char[] ca = {'n','a','r','a','y','a','n','a','s','w','a','m','y'};
		System.out.print("{");
		boolean firstElementPrinted=false;
		for(int i=0;i<ca.length;i++) {
			boolean isAlreadyPrinted=false;
			for(int j=0;j<i;j++) {
				if(ca[i]==ca[j]) {
					isAlreadyPrinted=true;
				}
			}
		if(!isAlreadyPrinted) {
			if(firstElementPrinted) {
				System.out.print(",");
			}
			System.out.print(ca[i]);
			firstElementPrinted=true;
		}
	}
		System.out.println("}");
	}
}
