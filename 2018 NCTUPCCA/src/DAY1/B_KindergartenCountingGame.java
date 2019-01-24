package DAY1;

import java.util.Scanner;

public class B_KindergartenCountingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			char[] in = sc.nextLine().toCharArray();
			int count = 0;
			boolean test = false;

			for (char st : in) {//會使用in所有的位置
				if (Character.isLetter(st)) {
					if (!test) {
						count++;
						test = true;
					}
				} else {
					test = false;
				}
			}

			System.out.println(count);
		}
	}
}
