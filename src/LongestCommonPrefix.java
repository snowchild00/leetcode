public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
      if( strs == null && strs.length < 1 ){
        return null;
      }
      
      int min = MAX_INT;
      for( int = 0; i < strs.length; i++ ){
        if( strs[i] == null ){
          return null;
        }
        if( strs[i].length < min ){
          min = strs[i].length;
        }
      }
      
      StringBuffer sb = new StringBuffer();
      
      for( int j = 0; j < min; j++ ){
        char ch = strs[0][j];
        for( int i = 1; i < strs.length; i++ ){
          if( strs[i] != ch ){
            return sb.toString();            
          }
        }
        sb.add( new String(ch) );  
      }
       
      
    }
}
