package DAY2;

import java.util.*;

public class A {
	public static Stack<Integer> st = new Stack<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(" ");

		for (int n = 0; n < in.length; n++) {
			
			if (Character.isDigit(in[n].charAt(0))) {
				st.push(Integer.parseInt(in[n]));				
			}
			else {
				ari(in[n]);
			}

		}
		System.out.println(st.pop());
	}

	public static void ari(String in) {
		int a=st.pop();
		int b=st.pop();
		int c=0;
		switch (in) {
		case "+":
			c=b+a;
			break;
		case "-":
			c=b-a;
			break;
		case "*":
			c=b*a;
			break;
		case "/":
			c=b/a;
			break;
			
		}
		st.push(c);
	}
}
