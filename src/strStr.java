public class Solution {
    public int strStr(String haystack, String needle) {
      if( haystack == null || haystack.length == 0 ||
          needle == null || needle.length == 0 )
          return -1;
      
      for( int i = 0; i < haystack.length; i++ ){
        int j = 0;
        for ( ; j < needle.length; j++ ){
          if( haystack[i] != needle[j] )
            continue;
        }
      
        if( j == needle.length ){
          return i;
        }
      }
      
      return -1;
        
    }
}
