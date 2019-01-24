package DAY5;
import java.util.*;
public class A_CuttingSticks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String in=sc.nextLine();
			if(in=="0") System.exit(0);
			String[] strarr=sc.nextLine().split(" ");
			int[] arr=new int[strarr.length];
			for(int n=0;n<strarr.length;n++) {
				arr[n]=Integer.parseInt(strarr[n]);
			}
			int min=Integer.parseInt(in)*arr.length;
			
		}
	}
	public static int minrod(int i,int j,int min) {
		int ans;
		return ans;
	}

}
