package DAY4;

import java.util.*;

public class C_TheClosestPairProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int inn = Integer.parseInt(sc.nextLine());
			if(inn==0) {
				System.exit(0);
			}
			double[][] arr = new double[inn][2];
			for (int n = 0; n <inn; n++) {
				String[] in = sc.nextLine().split(" ");
				arr[n][0]=Double.parseDouble(in[0]);
				arr[n][1]=Double.parseDouble(in[1]);
						}
			boolean test=false;
			Double maxxy=10000.0;
			for (int n1 = 0; n1 < arr.length-1; n1++) {
				for (int n2 = 0; n2 < arr[n1].length; n2++) {
					if(n2==n1) {
						continue;
					}
					double xy=Math.sqrt(Math.pow((arr[n1+1][0]-arr[n1][0]),2)+Math.pow((double)(arr[n1+1][1]-arr[n1][1]),2));
					if(xy<=maxxy) {
						test=true;
						maxxy=xy;
					}
					
				}
			}
			if(test) {
				System.out.printf("%.4f\n", maxxy);
				
			}
			else {
				System.out.println("INFINITY");
			}
		}
		
		

	}

}
