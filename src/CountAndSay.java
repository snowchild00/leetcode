public class CountAndSay {
	public String countAndSay( int n ){

	
		StringBuffer sb = new StringBuffer();
		
		int prev = -1;
		int repeat = 0;
		
		while ( n != 0 ) {
		    int digit = n % 10;
		    n /= 10;
		    
		    if ( prev == -1 ) {
		        repeat++
		        prev = digit;
		    } else if ( prev != digit ) {
		        sb.insert(0, digit)
		        sb.insert(0, repeat)
		        repeat = 1;
		    } else {
		    	repeat++;
		    }
		   	prev = digit;    
		    
		    
		}
    
		return sb.toString();
	}
}
