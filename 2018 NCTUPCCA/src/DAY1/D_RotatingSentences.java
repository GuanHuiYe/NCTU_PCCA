package DAY1;

import java.util.Scanner;

public class D_RotatingSentences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[100];
		int count = 0;
		while (sc.hasNext()) {
			str[count] = sc.nextLine();			
			count++;			
			
		}
		int max = 0;
		for (int n = count - 1; n >= 0; n--) {
			if (str[n].length() > str[max].length()) {
				max = n;
			}
		}
		for (int n =0; n <str[max].length(); n++) {
			for (int n2 = count - 1; n2 >= 0; n2--) {
				if(n>=str[n2].length()) {
					System.out.print(" ");
				}
				else {
					System.out.print(str[n2].charAt(n));	
				}				
			}
			System.out.println();
		}		
	}
}
