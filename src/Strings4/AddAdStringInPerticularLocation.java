package Strings4;

public class AddAdStringInPerticularLocation {

	public static void main(String[] args) {
		String str="Thanvi Bhuvi Varun Vaishnav";
		String[]words=str.split(" ");
		int index=1;
		String string="Abhi";
		String res="";
		for(int i=0;i<words.length;i++) {
			res=res+words[i]+" ";
			if(i==index) {
				res=res+string+" ";
			}

			
		}
		System.out.println(res);
	}

}
