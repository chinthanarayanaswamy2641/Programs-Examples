package Strings4;

public class SortingString {

	public static void main(String[] args) {
		String str="geeksorgeeks";
		char[]ca=str.toCharArray();
		char temp;
		for(int i=0;i<ca.length;i++) {
			for(int j=i+1;j<ca.length;j++) {
				if(ca[i]>ca[j]) {
				temp=ca[i];
				ca[i]=ca[j];
				ca[j]=temp;
			}
		}
		System.out.print(ca[i]);
		}
	}

}
