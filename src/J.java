
public class J {

	public static void main(String[] args) {
		
		String str = "This 23 is 45 Testing";
		String[]words=str.split(" ");
		for(String word:words) {
			char[]ca=word.toCharArray();
			String output="";
			for(int i=word.length()-1;i>=0;i--) {
				if(ca[i]>='A' && ca[i]<='Z' || ca[i]>='a' && ca[i]<='z') {
					output=output+ca[i];
				}else if(ca[i]>='0' && ca[i]<='9') {
					output=ca[i]+output;
				}
			}
			System.out.print(output+" ");
		}
	}

}
