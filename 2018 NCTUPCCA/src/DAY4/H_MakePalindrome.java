package DAY4;
import java.util.*;
public class H_MakePalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char[] arr=sc.nextLine().toCharArray();
		
		char[] list=new char[arr.length/2];
		int[] use=new int[arr.length];
		char[] loslist=new char[arr.length];
		int loscount=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(use[i]==1) {
				continue;
			}
			boolean test=false;
			for(int n=0;n<arr.length;n++) {
				if(i==n) {
					continue;
				}				
				if(arr[i]==arr[n]&&use[n]==0&&use[i]==0) {
					use[i]=1;
					use[n]=1;
					list[count]=arr[i];
					count++;
					test=true;
					break;
				}
				
			}
			if(!test) {
				loslist[loscount]=arr[i];
				loscount++;
			}
		}
	}

}
