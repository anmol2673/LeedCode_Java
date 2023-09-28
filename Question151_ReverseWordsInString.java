package LeedCode;

public class Question151_ReverseWordsInString {
	
	 public static String reverseWords(String s) {
	        String[] newS = s.trim().split("\\s+");
			StringBuilder sb = new StringBuilder();
			for (int i = newS.length - 1; i >= 0; i--) {
				sb.append(newS[i]);
				if (i > 0)
					sb.append(" ");
			}
			return sb.toString().strip();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("The sky is blue"));

	}

}
