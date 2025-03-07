package Strings4;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfWordsInAString {

	public static void main(String[] args) {
		String str="bhuvi varun vaishnav bhuvi thanvi varun";
		String[]words=str.split(" ");

		Map<String,Integer>m=new HashMap<String,Integer>();
	for(String word:words) {
		if(m.containsKey(word)) {
			m.put(word,m.get(word)+1);
		}else {
			m.put(word,1);
		}
	}
	for(String c:m.keySet()) {
		if(m.get(c)>0) {
			System.out.println(""+c+":"+ m.get(c));
		}
	}

	}
}
