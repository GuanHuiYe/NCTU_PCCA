package DAY3;

import java.util.Scanner;


public class C_BeautifulDivisors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(bd(sc.nextInt()));
	}
	public static int bd(int n) {
		if(n==1)return n;
		String st=Integer.toBinaryString(n);
		char[] ch=st.toCharArray();
		int count1=0,count0=0;
		int n1=0;		
	
		while(true) {
			if(n1==0&&ch[n1]=='1') {
				count1++;
			}
			if(n1!=0&&ch[n1]=='1'&&ch[n1-1]=='1') {
				count1++;
			}
			
			if(n1!=0&&ch[n1]=='0') {
				count0++;
				break;
			}
			n1++;
			if(n1==ch.length)
			{
				return bd(n-1);
			}
		}
		while(true) {
			if(n1==ch.length) {
				break;
			}
			if(ch[n1]=='1') {
				return bd(n-1);
			}
			if(ch[n1]=='0'&&ch[n1-1]=='0') {
				count0++;
			}
			n1++;
		}
		if(count1==count0+1) {
			return n;
		}
		return bd(n-1);
		
		
	}
}
