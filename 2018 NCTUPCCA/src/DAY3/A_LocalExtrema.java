package DAY3;

import java.util.Scanner;

public class A_LocalExtrema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		String[] in = sc.nextLine().split(" ");
		int[] arr = new int[in.length];
		for (int n1 = 0; n1 < in.length; n1++) {
			arr[n1] = Integer.parseInt(in[n1]);
		}
		int count = 0;
		for (int n1 = 0; n1 < in.length; n1++) {
			if (n1 != 0 && n1 != in.length - 1) {
				if (arr[n1] < arr[n1 - 1] && arr[n1] < arr[n1 + 1] || arr[n1] > arr[n1 - 1] && arr[n1] > arr[n1 + 1]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
