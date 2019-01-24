package DAY4;
import java.util.*;
public class D_CarmichaelNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			Double in=Double.parseDouble(sc.nextLine());
			if(in==0) {
				System.exit(0);
			}
			boolean test=false;
			for(double a=2;a<in;a++) {
				if((Math.pow(a, in))%in==a) {
					if(a>=in) {
						System.out.println(in+" is normal.");
						test=true;
						break;
					}					
				}
				
			}
			if(!test) {
				System.out.println("The number "+in+" is a Carmichael number.");
			}
			
		}
	}

}
