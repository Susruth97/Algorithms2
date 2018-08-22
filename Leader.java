import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Leader {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
				
		int max = arr[n-1];
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		q.add(max);
		
		for(int i = n-2; i >= 0; i--) {
			
			if(arr[i] > max) {
				max = arr[i];
				q.add(max);
			}
		}
		
		System.out.println(q);
	}
}
