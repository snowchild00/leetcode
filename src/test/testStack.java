import java.util.Stack;

public class testStack{

	public static void main(String[] args){

		Stack<Character> st = new Stack<>();
		st.push(new Character('a'));
		st.push(new Character('b'));

		System.out.println( st.pop() );
	}
}
