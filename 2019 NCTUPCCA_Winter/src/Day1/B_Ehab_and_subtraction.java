package Day1;

import java.util.*;

public class B_Ehab_and_subtraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		String[] input2 = sc.nextLine().split(" ");
		int[] intarr = new int[Integer.parseInt(input[0])];
		for (int n = 0; n < Integer.parseInt(input[0]); n++) {
			intarr[n] = Integer.parseInt(input2[n]);
		}
		Arrays.sort(intarr);
		int sumansarr = 0;
		int nth = 0;
		int n = 0;
		while (nth < Integer.parseInt(input[1])) {
			int num =0;
			if (n < Integer.parseInt(input[0])) {
				num = intarr[n];
				if (n == 0) {
					System.out.println(num);
					sumansarr += num;
					n++;
					nth++;
				} else {
					num -= sumansarr;
					if (num <= 0) {
						n++;
						continue;
					}
					System.out.println(num);
					sumansarr += num;
					nth++;

				}
			}
			else {
				System.out.println(num);
				nth++;
			}
			
			

		}

	}

}
