package LeedCode;

public class Question66_PlusOne {
	  public static int[] plusOne(int[] d) {
	        for(int i=d.length-1;i>=0;i--){
	            if(d[i]<9){
	                d[i]++;
	                return d;
	            }
	            d[i]=0;
	        }
	        d=new int[d.length+1];
	        d[0]=1;
	        return d;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []d= {9,9,9};
		int []c=plusOne(d);
		for (int i : c) {
			System.out.print(i);
		}
		
		

	}

}
