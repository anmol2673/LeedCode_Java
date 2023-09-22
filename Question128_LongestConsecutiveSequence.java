package LeedCode;

import java.util.Arrays;

public class Question128_LongestConsecutiveSequence {

	public static int longestConsecutive(int[] arr) {
		int count = 1;

		Arrays.sort(arr);
		int maxcount = 1;
		if (arr.length == 0) {
			return 0;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				continue;
			}
			if (arr[i] + 1 == arr[i + 1]) {
				count++;
				if (count > maxcount) {
					maxcount = count;
				}
			} else {
				count = 1;
			}

		}

		return maxcount;
	}

	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 100, 200, 201, 202 };
		System.out.println(longestConsecutive(n));

	}

}
