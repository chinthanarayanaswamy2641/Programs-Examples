import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="automatioooooon";
		//output 2u27m22i777777n
		char[]ca=str.toCharArray();
	
		String output="";
		for(int i=0;i<ca.length;i++) {
			int count=0;
			for(int j=0;j<ca.length;j++) {
				if(ca[i]==ca[j]) {
					count++;
				}
			}
			if(count>1) {
				output=output+count;
			}else {
				output=output+ca[i];
			}
		}
		System.out.println(output);
	}

}
// cns 