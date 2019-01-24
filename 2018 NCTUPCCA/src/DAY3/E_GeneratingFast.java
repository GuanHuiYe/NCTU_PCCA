package DAY3;

import java.util.Arrays;
import java.util.Scanner;

public class E_GeneratingFast {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		for (int n = Integer.parseInt(sc.nextLine()); n > 0; n--) {

			char[] arr=sc.nextLine().toCharArray();
			Arrays.sort(arr);
			recur(arr,0,arr.length-1);
			
		}

	}
	public static void recur(char[] arr,int start,int end)
	{
		
		if(end<1) {
			return;
		}
		if(end==1) {
			System.out.print(arr[0]);
			System.out.print(arr[1]);
			System.out.println();
			System.out.print(arr[1]);
			System.out.print(arr[0]);
			System.out.println();
			return;
		}
		if(start==end) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		else {
			for(int i=start;i<=end;i++) {
				swap(arr,i,start);
				recur(arr,start+1,end);
				swap(arr,i,start);
			}
		}
	}
	public static void swap(char[] arr,int m,int n) {
		char temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
	}
}
