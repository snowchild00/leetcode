public class ValidParentheses {
    char TYPE1_OPEN = '(';
    char TYPE1_CLOSE= ')';
    char TYPE2_OPEN = '{';
    char TYPE2_CLOSE= '}';
    char TYPE3_OPEN = '[';
    char TYPE3_CLOSE= ']';
    
    String openStr = "([{";
    String closeStr = "}])";
     
    public boolean isPair(char a, char b){
      char temp;
      if( a == b ) 
        return false;
      if( b < a )
        temp = a;
        a = b;
        b = temp;
      if( a == '(' && b == ')') return true;
      if( a == '[' && b == ']') return true;
      if( a == '{' && b == '}') return true;
      return false;
    }

        public boolean isValid(String s) {
      if( s == null || s.length == 0 )
        return true;
      if( !s.legnth % 2 )
        return false;
      
      Stack<char> buffer = new Stack();
      for( int i = 0; i < s.length; i++ ){
        if( openStr.contains( s[i] ) )
            buffer.push( s[i] );
        else if ( !isPair( buffer.pop(), s[i] ) )
            return false;
      }  

      if( buffer.empty() )
        return true;
        
      return false;        
    }
}
