package Day2;

import java.util.*;

public class G_Ordering_Tasks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		while (true) {
			String[] input = sc.nextLine().split(" ");
			int[] num = new int[Integer.parseInt(input[0])];
			for (int n = Integer.parseInt(input[1]); n > 0; n--) {

				String[] input2 = sc.nextLine().split(" ");

				// �����b�}�C
				if (!serch(list, Integer.parseInt(input2[0])) && !serch(list, Integer.parseInt(input2[1]))) {
					list.add(Integer.parseInt(input2[0]));
					num[Integer.parseInt(input2[0])]++;
					list.add(Integer.parseInt(input2[1]));
					num[Integer.parseInt(input2[1])]++;
				} else {

					if (!serch(list, Integer.parseInt(input2[0]))) {
						list.add(Integer.parseInt(input2[0]));
						num[Integer.parseInt(input2[0])]++;
					}
					else {
						
					}

					if (!serch(list, Integer.parseInt(input2[1]))) {
						list.add(Integer.parseInt(input2[1]));
						num[Integer.parseInt(input2[1])]++;
					}
					else {
						
					}
				}

			}

			for (int n = 0; n < num.length; n++) {
				if (num[n] == 0) {
					list.add(n);
				}
			}

		}
	}

	public static Boolean serch(LinkedList<Integer> arr, int look) {
		for (int num : arr) {
			if (look == num)
				return true;
		}
		return false;
	}

}
