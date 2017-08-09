import java.util.Stack;

public class ValidParentheses {

    String openStr = "([{";

    public boolean isPair(Character a, char b){
      if( a == b || a == null )
        return false;
      if( b < a ) {
		  char temp = a;
		  a = b;
		  b = temp;
	  }
      if( a == '(' && b == ')') return true;
      if( a == '[' && b == ']') return true;
      if( a == '{' && b == '}') return true;
      return false;
    }

    public boolean isValid(String s) {
      if( s == null || s.length() == 0 )
        return true;

      if( s.length() % 2 == 1 )
        return false;
      
      Stack<Character> buffer = new Stack<>();
      for( int i = 0; i < s.length(); i++ ){
		char ch = s.charAt(i);
        if( -1 < openStr.indexOf(ch) )
            buffer.push( new Character(ch) );
        else if ( buffer.empty() || !isPair( buffer.pop(), ch ) )
            return false;
      }  

      if( buffer.empty() )
        return true;
        
      return false;        
    }

	public boolean isValid2(String s){


        Stack<Character> st = new Stack<>();
        for( int i = 0; i < s.length(); i++ ){
            char ch = s.charAt(i);
            if( ch == '[' ) st.push(']');
            else if( ch == '(' ) st.push(')');
            else if( ch == '{' ) st.push('}');
            else if( st.empty() || st.pop() != ch ) return false;
        }
        if( st.empty() ) return true;
        return false;

	}


	public static void main(String[] args){
		ValidParentheses obj = new ValidParentheses();
		String[] input = {"[]", "", "[[][]]]", "[{(}", "){"};
		for( int i = 0; i < input.length; i++ ){
			System.out.println( ">> " + input[i] );
			System.out.println( "<< " + obj.isValid(input[i]) );
			System.out.println( "<< " + obj.isValid2(input[i]) );
		}
	}
}
