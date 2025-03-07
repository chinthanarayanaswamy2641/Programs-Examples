package Arrays3;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int a[]= {10,20,20,40,50,30,20,70,70,70,70};
		Map<Integer,Integer>m=new HashMap<Integer,Integer>();
		for(Integer c:a) {
			if(m.containsKey(c)) {
				m.put(c,m.get(c)+1);
			}else {
				m.put(c, 1);
			}
		}
		for(Integer c1:m.keySet()) {
			if(m.get(c1)>0) {
				System.out.println(c1);
			}
		}

	}

}
