import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Rev {

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
		    
		    int k = sc.nextInt();
		    		    
		    int i = 0;
		    
		    while(i < n) {
		    	
		    	int start = i, end = i + k - 1;
		    	
		    	if(end > n-1)
		    		end = n-1;
		    	
		    	while(start < end) {
		    		int temp;
		    		temp = arr[start];
		    		arr[start] = arr[end];
		    		arr[end] = temp;
		    		start++;
		    		end--;
		    	}
		    	
		    	//System.out.println(Arrays.toString(arr));
		    	
		    	i = i + k;
		    	
		    }
		    
		    for(int j = 0; j < n; j++) {
		        System.out.print(arr[j] + " ");
		    }
		    System.out.println();
		    l++;
		}
		
		sc.close();
	}

}
