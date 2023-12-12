package string;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="welcome";
		String rev ="";
		
		
	char[] w =	s.toCharArray();
	for(int i = w.length-1;i>=0;i--) {
		
		char revnum = w[i];
		
		rev=rev+revnum;
		
		
	}
     System.out.println(rev);
	}

}
