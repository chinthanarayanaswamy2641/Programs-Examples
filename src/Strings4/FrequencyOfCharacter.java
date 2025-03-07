package Strings4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String str="abbbbeeeeeefgxxxxxxxaa";		
		char[]ca=str.toCharArray();
		Map<Character,Integer>m=new HashMap<Character,Integer>();
	for(Character c:ca) {
		if(m.containsKey(c)) {
			m.put(c,m.get(c)+1);
		}else {
			m.put(c,1);
		}
	}
	for(Character c:m.keySet()) {
		if(m.get(c)>0) {
			System.out.print(""+c+m.get(c));
		}
	}
	}
}
