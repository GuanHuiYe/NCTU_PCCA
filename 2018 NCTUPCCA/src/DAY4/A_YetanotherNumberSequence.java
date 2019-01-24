package DAY4;

import java.util.*;

public class A_YetanotherNumberSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = Integer.parseInt(sc.nextLine()); i > 0; i--) {
			String[] in = sc.nextLine().split(" ");
			
			
			String ans = Long.toString(fibonacci(Integer.parseInt(in[2]),Integer.parseInt(in[0]),Integer.parseInt(in[1])));
			if (ans.length() < Integer.parseInt(in[3])) {
				System.out.println(ans);
			} else {
				System.out.println(ans.substring(ans.length() - Integer.parseInt(in[3]), ans.length()));
			}

		}
	}

	final static int[] A= {1,1,1,0};
	  static int fibonacci(int n,int a,int b){  
	        if(n==0)return a;  
	        if(n==1)return b;  
	        if(n>1){  
	            int[] re=power(n-1);  
	            return re[0];
	        }  
	        return -1;  
	    }  
	      
	      
	    static int[] power(int n){  
	        int[] a=new int[4];  
	        if(n==1){  
	            a=A;  
	        }  
	        else if(n%2==0){  
	            a=matixMultiply(power(n/2),power(n/2));  
	        }else if(n%2==1){  
	            int[] temp=matixMultiply(power(n/2),power(n/2));  
	            a=matixMultiply(A,temp);  
	        }  
	        return a;  
	    }  	      
	    
	    static int[] matixMultiply(int[] a,int [] b){  
	        int[] re=new int[4];  
	        re[0]=a[0]*b[0]+a[1]*b[2];  
	        re[1]=a[0]*b[1]+a[1]*b[3];  
	        re[2]=a[2]*b[0]+a[3]*b[2];  
	        re[3]=a[2]*b[1]+a[3]*b[3];  
	        return re;  
	    }  
	
	
	
	
	
	
	
	
	/*
	public static Map<Integer, Long> map;

	public static void usemap(int a, int b) {
		map = new HashMap<Integer, Long>() {
			{
				put(0, (long) a);
				put(1, (long) b);
			}
		};
	}

	public static long fib(int n) {
		if (map.containsKey(n))
			return map.get(n);
		map.put(n, fib(n - 1) + fib(n - 2));
		return map.get(n);
	}
	*/

}
