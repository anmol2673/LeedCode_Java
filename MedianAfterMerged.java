package arrays;

import java.util.Arrays;

public class MedianAfterMerged {
	
	public  static double  findMedianSortedArrays(int[] nums1, int[] nums2) {
		int pos=0;
        int median=0;
        int n=nums1.length+nums2.length;
        int []merged=new int[n];
        for(int i=0;i<nums1.length;i++){
            merged[pos]=nums1[i];
            pos++;
        }
        for(int i=0;i<nums2.length;i++){
            merged[pos]=nums2[i];
            pos++;
        }
        Arrays.sort(merged);
        
        int s=merged.length;
        double med = 0;
        int mid=s/2;
        if(s%2!=0) {
        	
        	med=merged[mid];
        }else {
        	med=(merged[mid]+merged[mid-1])/2.0;
        }
		
		
		
		
		return med;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1= {1,3};
		int []nums2= {2,7};
		double d = findMedianSortedArrays(nums1, nums2);
		System.out.println(d);
		
	}

}
