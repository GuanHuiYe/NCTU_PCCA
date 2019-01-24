package DAY2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class E {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=Integer.parseInt(sc.nextLine());
		String[] in=sc.nextLine().split(" ");
		Queue<Integer> qu = new LinkedList<Integer>();
		for(int n3=0;n3<in.length;n3++) {
			qu.offer(Integer.parseInt(in[n3]));
		}
		int[] tree=new int[size];
		int n=0;
		boolean test=false;
		while(!qu.isEmpty()) {
			if(!test) {	
				int index=0;
				for(int n4=0;n4<tree.length;n4++) {
					if(tree[n4]==0) {
						index=n4;
					}
				}
				tree[index]=qu.poll();
			}	
			
			if(n!=0&&tree[(n+1)/2-1]<tree[n]) {
				int temp=tree[(n+1)/2-1];
				tree[(n+1)/2-1]=tree[n];
				tree[n]=temp;
				n=(n+1)/2-1;
				test=true;
				continue;
			}
			else if(n!=0&&n!=1&&tree[n/2-1]<tree[n]) {
				int temp=tree[n/2-1];
				tree[n/2-1]=tree[n];
				tree[n]=temp;
				n=n/2-1;
				test=true;
				continue;
			}
			++n;
			test=false;
		}
		for(int n2=0;n2<in.length;n2++) {
			System.out.print(" "+tree[n2]);
		}
		System.out.println();
	}

}
