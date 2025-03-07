package apractiseCharacter;

public class DuplicateCharacters {

	public static void main(String[] args) {
		char[] ca = {'n','a','r','a','y','a','n','a','s','w','a','m','y'};
	    for(int i=0;i<ca.length;i++) {
	    	boolean isDuplicated=false;
	    	for(int j=i+1;j<ca.length;j++) {
	    	if(ca[i]==ca[j]) {
	    		isDuplicated=true;
	    		break;
	    	}
	    	}
	    	boolean alreadyPrinted=false;
	    	for(int k=0;k<i;k++) {
	    		if(ca[i]==ca[k]) {
	    			alreadyPrinted=true;
	    			break;
	    		}
	    	}
	    	if(isDuplicated && !alreadyPrinted) {
	    		
	    		System.out.print(ca[i]);
	    		
	    	}
	    }
	   

	}

}
