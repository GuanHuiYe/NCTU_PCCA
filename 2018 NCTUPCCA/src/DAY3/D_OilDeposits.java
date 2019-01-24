package DAY3;

import java.util.*;

public class D_OilDeposits {
	public static char[][] arr;
	public static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(" ");
		if(in[0]=="0"&&in[1]=="0") {
			System.exit(0);
		}
		arr = new char[Integer.parseInt(in[0])][Integer.parseInt(in[1])];
		for (int n = 0; n < arr.length; n++) {
			arr[n] = sc.nextLine().toCharArray();
		}
		count = 0;
		oil();
	}

	public static void oil() {
		for (int n = 0; n < arr.length; n++) {
			for (int n1 = 0; n1 < arr[n].length; n1++) {
				if(arr[n][n1] == '@') {
					count++;
					oilkill(n, n1);
				}			
				
			}
		}
		System.out.println(count);
	}

	public static void oilkill(int x, int y) {
		if(x<0||x>arr.length-1||y<0||y>arr[0].length-1) {
			return;
		}
		if (arr[x][y] == '@') {
			arr[x][y] = '*';
			
			oilkill(x + 1, y);
			oilkill(x + 1, y + 1);
			oilkill(x + 1, y - 1);
			oilkill(x - 1, y);
			oilkill(x - 1, y - 1);
			oilkill(x - 1, y + 1);
			oilkill(x, y + 1);
			oilkill(x, y - 1);
		}
		
	}

}
