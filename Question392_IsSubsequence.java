package LeedCode;

public class Question392_IsSubsequence {
	
	  public static boolean isSubsequence(String s, String t) {
	   // String st="";
		  int i=0;
		  int j=0;
		  while (i<s.length() && j<s.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
			}
			j++;
		}
		 
		
	       return i==s.length(); 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean s = isSubsequence("axc","ahbgdc");
		System.out.println(s);

	}

}
