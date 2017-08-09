public class ReverseInteger {

	public int reverseInteger(int x){
		long y = 0;
		int sign = 1;
		if( x < 0 ){
			sign = -1;
			x *= sign;
		}

		while( 0 < x ){
			y = y * 10 + x % 10;
			x /= 10;
		}

		if( y == (int)y ){
			return (int)y * sign;
		}
		return 0;
		
	}

	public static void main(String[] args){

		ReverseInteger obj = new ReverseInteger();
		int[] xs = {-1, 10, 11, 23, 454, 123456789, 1147483649};
		for( int i = 0; i < xs.length; i++ ){
			System.out.println("<< " + xs[i]);
			System.out.println(">> " + obj.reverseInteger(xs[i]));
			System.out.println("");
		}

		System.out.println(Integer.MAX_VALUE);
	}
}
