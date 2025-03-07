package apractiseCharacter;

public class UniqueCharactrersWithCurleBraces {

	public static void main(String[] args) {
		String str="naryanaswamy";
		char[]ca=str.toCharArray();
		System.out.print("{");
		boolean firstElementPrinted=false;
		for(int i=0;i<ca.length;i++) {
			boolean alreadyPrinted=false;
			for(int j=0;j<i;j++) {
				if(ca[i]==ca[j]) {
					alreadyPrinted=true;
					
				}
			}
			if(!alreadyPrinted) {
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
