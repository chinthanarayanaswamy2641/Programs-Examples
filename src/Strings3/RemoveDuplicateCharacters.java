package Strings3;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String str="narayanaswamy";
		char[]ca=str.toCharArray();
		String duplicates="";
		for(int i=0;i<ca.length;i++) {
			for(int j=i+1;j<ca.length;j++) {
				char c=ca[i];
				String s=Character.toString(c);
				if(ca[i]!=ca[j] && !duplicates.contains(s)) {
					duplicates=duplicates+ca[i];
				}
			}
		}
                 System.out.println(duplicates);
	}

}





/*
String str="narayanaswamy";
String res="";
for(int i=0;i<str.length();i++) {
	String ch=""+str.charAt(i);
	if(res.contains(ch)) {
		continue;
	}
	res=res+str.charAt(i);
	
}
System.out.println(res);*/