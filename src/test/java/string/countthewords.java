package string;

import java.util.HashMap;

public class countthewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String words = "we are boys and we are brave then ";
  
   String [] count = words.split(" ");
   
   HashMap<String, Integer> m = new HashMap<String , Integer>();
     
   for (int i = 0; i < count.length; i++) {
	   
	String k =   count[i];
	
	if (m.containsKey(k)) {
		
	Integer g =	m.get(k);
	
	m.put(k, g+1);	
		
	} else {
     m.put(k,1);
	}
	
}
   System.out.println(m);
	}

}
