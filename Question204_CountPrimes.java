package LeedCode;

public class Question204_CountPrimes {

	public static boolean isPrime(int n) {
	    if (n < 2) {
	        return false;
	    }
	    if (n == 2) {
	        return true;
	    }
	    if (n % 2 == 0) {
	        return false;
	    }
	    for (int i = 3; i <= Math.sqrt(n); i += 2) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	public static int countPrimes(int n) {
		int count = 0;
		for (int i = 2; i < n-1; i++) {
			if(isPrime(i)) {
				count++;
			}
			
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(countPrimes(100));
		// System.out.println(isPrime(41));

	}

}
