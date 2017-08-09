public class PalindromeNumber {

	// for a positive integer
    public boolean isPalindrome(int x) {
		if( x < 0 ) return false;
     
		int p = x;
		int q = 0;

		System.out.println(p + ", " + q); 
		while ( 10 <= p ){
			q = q * 10 + p % 10;
			p = p/10;
			System.out.println(p + ", " + q); 
		}
		if( q == x / 10 && x % 10 == p )
			return true;

		return false;
    }


  public static void main(String[] args){
    PalindromeNumber obj = new PalindromeNumber();
    int[] inputs = {10, -10, 23456, 22, 232, 234, 1, -2147483648, -2147447412, -33, 1000021};
    for( int i = 0; i < inputs.length; i++ ){
      System.out.println("<< " + inputs[i]);
      System.out.println(">> " + obj.isPalindrome(inputs[i]));
    }

	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
  }
}
