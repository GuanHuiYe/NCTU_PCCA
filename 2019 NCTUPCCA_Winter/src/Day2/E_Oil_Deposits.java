package Day2;

import java.util.*;

public class E_Oil_Deposits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String[] input = sc.nextLine().split(" ");
			if (input[0].equals("0") && input[1].equals("0"))
				break;

			String[][] map = new String[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

			for (int n = 0; n < map.length; n++) {
				char[] in = sc.nextLine().toCharArray();
				int nth = 0;
				for (char text : in) {
					map[n][nth] = String.valueOf(text);
					nth++;
				}
			}
			int[] first_found = found(map, "@");
			if (first_found[0] == -1)
				System.out.println("0");
			else {
				int nth = 1;
				int x = first_found[0];
				int y = first_found[1];
				while (true) {
					go_found(map, x, y, "@", String.valueOf(nth));
					
					int[] resultfinal = found(map, "@");
					if (resultfinal[0] == -1) {
						System.out.println(nth);
						break;
					}
					else {
						x = resultfinal[0];
						y = resultfinal[1];			
						nth++;
					}

				}
			}

		}

	}

	public static int[] found(String[][] map, String aims) {
		for (int n = 0; n < map.length; n++) {
			for (int nn = 0; nn < map[n].length; nn++) {
				if (map[n][nn].equals(aims))
					return new int[] { nn, n };
			}
		}
		return new int[] { -1 };
	}

	public static void go_found(String[][] map, int x, int y, String aims, String change) {
		if (x < 0 || y < 0)
			return;
		if (map.length <= y)
			return;
		if (map[y].length <= x)
			return;
		if (map[y][x].equals(aims)) {
			map[y][x] = change;
			go_found(map, x - 1, y, aims, change);// ��
			go_found(map, x - 1, y + 1, aims, change);// ���W
			go_found(map, x, y + 1, aims, change);// �W
			go_found(map, x + 1, y + 1, aims, change);// �k�W
			go_found(map, x + 1, y, aims, change);// �k
			go_found(map, x + 1, y - 1, aims, change);// �k�U
			go_found(map, x, y - 1, aims, change);// �U
			go_found(map, x - 1, y - 1, aims, change);// ���U

		}

	}

}
