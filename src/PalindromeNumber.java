public class PalindromeNumber {
    public boolean isPalindrome(int x) {
      int length = String.valueOf(x).length();
      
      if( x < 0 )
        x *= -1;
      
      for( int i = 0; i < length/2; i++ ){
        int j = length - i -1;
        int a = x / pow(10, j);
        int b = x % pow(10, i+1);
        if( a != b )
          return false;
      }
      
      return true;  
    }
}
