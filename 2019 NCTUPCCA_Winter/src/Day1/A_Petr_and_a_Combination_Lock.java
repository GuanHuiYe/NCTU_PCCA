package Day1;
import java.util.*;
public class A_Petr_and_a_Combination_Lock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nth=Integer.parseInt(sc.nextLine());
		int[] arr=new int[nth];
		for(int n=0;n<nth;n++) {
			arr[n]=Integer.parseInt(sc.nextLine());
		}
		Boolean testans=false;
		for(int n=0;n<=Math.pow(2, nth)-1;n++) {
			
			 String test=Integer.toBinaryString(n);		
			 while(test.length()<nth) {
				 test="0"+test;
			 }
			 
			 int sum=0;
			 for(int nn=0;nn<test.length();nn++) {
				 if(Integer.parseInt(test.substring(nn,nn+1))==0) {
					 sum+=arr[nn];
				 }
				 else {
					 sum-=arr[nn];
				 }
			 }
			 if(sum%360==0) {
				 testans=true;
				 break;
			 }			
		}
		if(testans) {
			System.out.println("YES");
			
		}
		else {
			System.out.println("NO");
		}
		
	}
	
}
