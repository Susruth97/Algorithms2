import java.util.Scanner;

public class SeqInc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		int sum = a[0], max;
		max = sum;
		
		for(int i = 1; i < n; i++) {
			
			if(a[i-1] <= a[i])
				sum = sum + a[i];
			else {
				
				//System.out.println(sum);
				if(sum > max)
					max = sum;
				
				int tar = a[i], j = i-1;
				
				while(j >= 0 && tar < a[j]) {
					sum = sum - a[j];
					j--;
				}
				
				sum = sum + a[i];
				
			}
		}
		
		System.out.println(max);
	}

}
