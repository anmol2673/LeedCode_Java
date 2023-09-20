package LeedCode;

import java.util.Arrays;

public class Question14 {

	public static String commonPrefix(String[] srr) {

		Arrays.sort(srr);

		String s1 = srr[0];
		String s2 = srr[srr.length - 1];
		int idx = 0;
		while (idx < s1.length() && idx < s2.length()) {
			if (s1.charAt(idx) == s2.charAt(idx)) {
				idx++;
			} else {
				break;
			}
		}

		return s2.substring(0, idx);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] srr = { "aaa", "aa", "aaa" };
		System.out.println(commonPrefix(srr));

	}

}
