package Day2;
import java.util.*;

public class A_Graph {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=Integer.parseInt(sc.nextLine());
		int[][] ans=new int[size+1][size+1];
		for(int nth=1;nth<size+1;nth++) {
			String[] input=sc.nextLine().split(" ");
			for(int n=0,index=2;n<Integer.parseInt(input[1]);n++,index++) {				
				ans[Integer.parseInt(input[0])][Integer.parseInt(input[index])]=1;
			}
		}
		for(int n=1;n<ans.length;n++) {
			for(int nn=1;nn<ans[n].length;nn++) {
				System.out.print(ans[n][nn]+" ");
			}
			System.out.println();
		}
	}

}
