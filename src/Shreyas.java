
public class Shreyas {

	public static void main(String[] args) {
		String str = "aotomation";
	       char[]ca=str.toCharArray();
	       int count=0;
	       String output="";
	       for(int i=0;i<ca.length;i++) {
	    	   if(ca[i]=='o') {
	    		   count++;
	    		   if(count==1) {
	    			   output=output+'&';
	    		   }else if(count==2) {
	    			   output=output+"&&";
	    		   }else if(count==3) {
	    			   output=output+"&&&";
	    		   }
	    	   }else {
	    		   output=output+ca[i];
	    	   }
	       }
	       System.out.println(output);

	}

}
