import java.util.*;
import java.io.*;

public class masSumAfterKnot {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int n, k;
		
		n = s.nextInt();
		k = s.nextInt();
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int val = s.nextInt();
			q.add(val);
			sum = sum + val;
		}
		
		while(k != 0) {
			
			if(q.peek() >= 0) {
				if(k % 2 == 1) {
					int val = -1 * q.poll();
					q.add(val);
					sum = sum + 2 * val;
				}
				k = 0;
			}
			else {
				int val = -1 * q.poll();
				q.add(val);
				sum = sum + 2 * val;
				k--;
			}
		}
		
		System.out.println(sum);
	}

}
