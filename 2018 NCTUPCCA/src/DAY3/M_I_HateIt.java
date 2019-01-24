package DAY3;
import java.util.*;
public class M_I_HateIt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] in=sc.nextLine().split(" ");
		int[] id=new int[Integer.parseInt(in[0])];
		
		String[] in2=sc.nextLine().split(" ");
		for(int i=0;i<in2.length;i++) {
			id[i]=Integer.parseInt(in2[i]);
		}
		for(int i=0;i<Integer.parseInt(in[1]);i++) {
			String[] q=sc.nextLine().split(" ");
			switch(q[0]) {
			case "Q":
				
				int max=id[Integer.parseInt(q[1])-1];
				int maxindex=Integer.parseInt(q[1])-1;
				for(int n=maxindex;n<=Integer.parseInt(q[2])-1;n++) {
					if(max<id[n]) {
						max=id[n];
						maxindex=n;
					}
				}
				System.out.println(id[maxindex]);
				break;
			case"U":
				id[Integer.parseInt(q[1])-1]=Integer.parseInt(q[2]);
				break;
					
			}
		}
	}

}
