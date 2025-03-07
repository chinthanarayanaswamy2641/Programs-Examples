package Strings2;



import java.util.HashMap;
import java.util.Map;

import javax.xml.stream.events.Characters;

public class PrintDuplicatesCharactersUsingMap {

	public static void main(String[] args) {
		String str="narayanaswamy";
		char[]ca=str.toCharArray();
		Map<Character,Integer>m=new HashMap<Character,Integer>();
		for(Character c:ca) {
			if(m.containsKey(c)) {
				m.put(c,m.get(c)+1);
			}else {
				m.put(c, 1);
			}
		}
		for(Character c1:m.keySet()) {
			if(m.get(c1)>1) {
				System.out.println("duplicate characters in the given string is :"+c1);
			}
		}
	}
}