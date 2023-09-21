package LeedCode;

public class Question58_LengthOfLastWordInString {

//	 public  int  lengthOfLastWord(String s) {
//		 
//		 
//		return ans;
//	        
//	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" fly me to the moon";
		//System.out.println(lengthOfLastWord(s));
		String[] split = s.split(" ");
		String string = split[split.length-1];
		System.out.println(string.length());
	}

}
