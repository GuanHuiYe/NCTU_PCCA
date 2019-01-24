package DAY4;
import java.util.*;
public class B_Ultra_QuickSort {
	public static int[] arr;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String instr=sc.nextLine();
			int in=Integer.parseInt(instr);
			if(in==0) {
				System.exit(0);
			}
			arr =new int[in];
			for(int n=0;n<in;n++) {
				arr[n]=Integer.parseInt(sc.nextLine());
			}
			MergeSort(0,in);
			for(int n=0;n<arr.length;n++) {
				System.out.print(arr[n]+" ");
			}
			System.out.println();
		}
	}
	public static void MergeSort(int arrindex,int len) {
		int M=len/2;
		if(len==1) return;
		MergeSort(arrindex,M);
		MergeSort(arrindex+M,len-M);
		Merge(arrindex,len,M);
		
	}
	public static void Merge(int arrindex,int len,int M) {
		Stack<Integer> st=new Stack<Integer>();
		int x,y;
		for(x=0,y=M;x<M&&y<len;) {
			if(arr[x]<arr[y]) {
				st.push(arr[x++]);
			}
			else {
				st.push(arr[y++]);
			}
		}
		if(x==M) {
			while(y<len) {
				st.push(arr[y++]);
			}
		}
		if(y==len) {
			while(x<M) {
				st.push(arr[x++]);
			}
		}
		for(int i=0;i<st.size();i++) {
			arr[i]=st.elementAt(i);
		}
	}
}
