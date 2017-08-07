public class PalindromeNumber {
    public boolean isPalindrome(int x) {
      int length = String.valueOf(x).length();
      
      if( x < 0 )
        x *= -1;
      
      for( int i = 0; i < length/2; i++ ){
        int j = length - i -1;
        int a = x / (int) Math.pow((double)10, (double) j);
        int b = x % (int) Math.pow((double)10, (double)(i+1));
        if( a != b )
          return false;
      }
      
      return true;  
    }


  public static void main(String[] args){
    PalindromeNumber obj = new PalindromeNumber();
    int[] inputs = {10, -10, 23456, 22, 232, 234, 1};
    for( int i = 0; i < inputs.length; i++ ){
      System.out.println(inputs[i]);
      System.out.println(obj.isPalindrome(inputs[i]));

    }
  }
}
