public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
      if( strs == null || strs.length == 0 ){
        return "";
      }

      int min = Integer.MAX_VALUE;
      for( int i = 0; i < strs.length; i++ ){
        if( strs[i].length() < min ){
          min = strs[i].length();
        }
      }


	  StringBuffer sb = new StringBuffer();

      for( int j = 0; j < min; j++ ){
        char ch = strs[0].charAt(j);
        for( int i = 1; i < strs.length; i++ ){
          if( strs[i].charAt(j) != ch ){
            return sb.toString(); 
          }
        }
		sb.append(ch);
      }
      return sb.toString();

    }


    public static void main(String[] args){
		LongestCommonPrefix obj = new LongestCommonPrefix();
		String[] strs = {"jsiejf", "j234", "jsd"};
		System.out.println(">> " + obj.longestCommonPrefix(strs));
	}
}
