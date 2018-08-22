import java.util.*;
import java.lang.*;
import java.io.*;

class Klarge {
	public static void main (String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int s = 0;
		
		while(s < t) {
			
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			
			PriorityQueue<Integer> q = new PriorityQueue<Integer>();
			ArrayList<Integer> out = new ArrayList<>();
			int j = 0;
			
			for(int i = 0; i < n; i++) {
				int num = arr[i];
				q.add(num);
				
				System.out.println(q.size());
				
				if(q.size() < k)
					out.add(-1);
				else {
					
					Iterator itr = q.iterator();
					
					int l = 1;
					for(Integer e : q) {
						if(l == (q.size() - k + 1)) {
							out.add(e);
							System.out.println(e);
						}
						l++;
					}
					
					
				}
			}
			
			System.out.println(out);
			s++;
		}
	}
}