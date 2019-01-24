package DAY1;

import java.math.BigInteger;//大整數
import java.util.Scanner;

public class L_Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			BigInteger in1 = sc.nextBigInteger();
			BigInteger in2 = sc.nextBigInteger();
			System.out.println(in1.multiply(in2));//大整數乘法用 multiply
		}
	}

}
