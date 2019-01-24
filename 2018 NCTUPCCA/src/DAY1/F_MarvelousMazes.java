package DAY1;

import java.util.Scanner;

public class F_MarvelousMazes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = 0;
			char[] arr = sc.nextLine().toCharArray();			
			if(arr==null) {
				System.out.println();
			}
			while (n < arr.length) {				
				int sum=0;
				if (Character.isDigit(arr[n])) {
					sum=arr[n];
					int nth=n;
					while(true) {
						if(Character.isDigit(arr[nth+1])) {
							sum+=arr[nth+1];
							nth++;
						}
						else {
							break;
						}						
					}
					if (arr[n + nth-1] == 'b') {
						for (int n2 = 0; n2 < sum; n2++) {
							System.out.print(" ");
						}
					} else {
						for (int n2 = 0; n2 < sum; n2++) {
							System.out.print(arr[n + nth-1]);
						}
					}
					n += nth;
					continue;
				}
				if (arr[n] == '!') {
					System.out.println();
					n += 1;
				}
			}
			System.out.println();

		}
	}

}
