package Day3;

import java.util.*;

public class C_Grid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input = sc.nextLine().split(" ");
			int[][] arr = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];
			for (int n = 0; n < arr.length; n++) {
				String[] input2 = sc.nextLine().split(" ");
				for (int nn = 0; nn < input2.length; nn++) {
					arr[n][nn] = Integer.parseInt(input2[nn]);
				}
			}
			
			gogo(arr,0,0);			
			
			System.out.println(sum);

		}
	}

	public static int sum = 0;

	public static void gogo(int[][] arr, int x, int y,int x1,int y1) {
		if(x<0||y<0&&x1<0||y1<0)return;	
		if(arr.length<=y||arr.length<=y1)return;
		if(arr[y].length<=x||arr[y1].length<=x1)return;		
		if(arr[y][x]==0)return;
		--arr[y][x];
		if(arr[y1][x1]==0)return;
		--arr[y1][x1];
		sum++;
		Boolean test=true;
		for(int[] nums : arr) {
			for(int num : nums) {
				if(num!=0) {
					test=false;
					break;
				}
			}
			if(!test) break;
		}
		if(!test)return;
		else {			
		
		}
	}

}
