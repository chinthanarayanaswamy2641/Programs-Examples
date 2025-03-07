package apractiseCharacter;

public class UniqueChatacters {

	public static void main(String[] args) {
		String str="naryanaswamy";
		char[]ca=str.toCharArray();
		for(int i=0;i<ca.length;i++) {
			boolean alreadyPrinted=false;
			for(int j=0;j<i;j++) {
				if(ca[i]==ca[j]) {
					alreadyPrinted=true;
					
				}
			}
			if(!alreadyPrinted) {
				System.out.print(ca[i]);
			}
		}

	}

}
