import java.util.*;

public class ConPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] prime = new long[n];
		long sum = 0;
		int k = 0, out = 0;
		prime[k]= 2;
		sum = 2;
		
		for(int i = 3; i <= n/2; i = i + 2) {
			
			int count = 0;
			for(int j = 0; j <= k; j++) {
				
				if(i % prime[j] == 0)
					count++;
			}
			
			if(count == 0) {
				k++;
				prime[k] = i;
				//System.out.println(prime[k]);
				sum = sum + prime[k];
			}
			
			if(isPrime(sum) == 1)
				out++;
			
			if(sum > n)
				break;
			
		}
		
		System.out.println(out);
		
	}
	
	static int isPrime(long sum) {
		
		if(sum == 2 || sum == 3)
			return 1;
		else if(sum % 2 == 0 || sum % 3 == 0 || sum % 5 == 0)
			return 0;
		else {
			int count = 0;
			for(int i = 5; i*i <= sum; i = i + 6) {
				if(sum % i == 0 || sum % (i+2) == 0)
					count++;
			}
			if(count == 0)
				return 1;
			else
				return 0;
		}
	}

}
