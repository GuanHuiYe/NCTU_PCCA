package DAY3;

import java.util.Scanner;
import java.util.Stack;

public class B_Transformation_fromAtoB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(" ");
		test = false;
		
		trans(Integer.parseInt(in[0]), Integer.parseInt(in[1]));
		if(!test) {
			System.out.println("NO");
		}
	}

	public static Stack<Integer> stk = new Stack<Integer>();
	public static boolean test = false;
	public static Stack<Integer> stk2 = new Stack<Integer>();
	public static void trans(int a, int b) {
		
		stk.push(a);
		if (a == b) {
			test = true;
			
			while (!stk.isEmpty()) {
				stk2.push(stk.pop());
			}
			System.out.println("YES");
			System.out.println(stk2.size());
			while(!stk2.isEmpty()) {
				System.out.print(stk2.pop()+" ");
			}
			System.out.println();
			System.exit(0);
		} else if (a > b) {
			stk.pop();

			return;
		} else {
			trans(2 * a, b);
			trans(10 * a + 1, b);
			
			
		}
		stk.pop();
		

	}

}
