import java.util.*;

public class Cpu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] p = new int[2];
		int[] t = new int[2];
		
		for(int i = 0; i < 2; i++) {
			
			p[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}
		
		float dt;
		
		float dp = Math.abs(p[1] - p[0]);
		
		if(t[0] > t[1])
			dt = t[0]/t[1];
		else
			dt = t[1]/t[0];
		
		float num = (dp*dt) - dp;
		float den = num + 1;
		
		float par = num/den * 10000;
		float ser = (10000 - par);
		
		double x = Math.floor((double)par)/100;
		double y = Math.floor((double)ser)/100;
		
		System.out.printf("%.2f %.2f", y,x);
		

	}

}
