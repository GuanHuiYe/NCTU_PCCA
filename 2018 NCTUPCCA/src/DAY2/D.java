package DAY2;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nodecount=Integer.parseInt(sc.nextLine());
		String[] node=sc.nextLine().split(" ");
		for(int n=0;n<node.length;n++) {			
			System.out.print("node "+(n+1)+": key = "+node[n]+", ");
			
			if((n+1)%2==0&&n!=0) {
				System.out.print("parent key = "+node[(n+1)/2-1]+", ");
			}
			else if(n%2==0&&n!=0) {
				System.out.print("parent key = "+node[((n+1)-1)/2-1]+", ");
			}
				
			
			if(node.length>=(n+1)*2) {
				
				System.out.print("left key = "+node[(n+1)*2-1]+", ");
			}
			if(node.length>=((n+1)*2)+1) {
				System.out.print("right key = "+node[((n+1)*2)]+", ");
			}
			System.out.println();
		}
				
				
	}

}
