import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Wtrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int l = 0;
		
		while(l < t) {
			
			int n = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i = 0; i < n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    
		    int[] left = new int[n];
		    left[0] = arr[0];
		    
		    for(int i = 1; i < n; i++)
		    	left[i] = Math.max(left[i-1], arr[i]);
		    
		    //System.out.println(Arrays.toString(left));
		    
		    int[] right = new int[n];
		    
		    right[n-1] = arr[n-1];
		    for(int i = n-2; i >= 0; i--)
		    	right[i] = Math.max(right[i+1], arr[i]);
		    
		    //System.out.println(Arrays.toString(right));
		    
		    int tot = 0;
		    
		    for(int i = 1; i < n-1; i++)
		    	tot = tot + (Math.min(left[i], right[i]) - arr[i]);
		    
		    System.out.println(tot);
		    
		    l++;
		}
		
		sc.close();
	}

}
