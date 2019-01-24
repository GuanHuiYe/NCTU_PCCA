package DAY1;

import java.util.Scanner;

 class A_SimpleBaseConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String in = sc.nextLine();
			
			if (in.charAt(0)=='-') {
				break;
			}
			
			if (in.charAt(0)!='0') {

				System.out.println("0x" + (Long.toHexString(Long.parseLong(in))).toUpperCase());//toUpperCase ¤j¼g
			} else {

				System.out.println(Integer.parseInt(in.substring(2, in.length()), 16));
			}
		}
	}
}
