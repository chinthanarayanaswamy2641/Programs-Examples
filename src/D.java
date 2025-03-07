
public class D {

	public static void main(String[] args) {
		String s = "acbcabbbbcbcdbc"; 
		char[]ca=s.toCharArray();
		int maxFreq=0;
		for(int i=0;i<ca.length;i++) {
			int count=0;
		for(int j=0;j<ca.length;j++) {
			if(ca[i]==ca[j]) {
				count++;
			}
		}
		if(count>maxFreq) {
			maxFreq=count;
		}
		}
		System.out.println(maxFreq);
	}
		
	}


