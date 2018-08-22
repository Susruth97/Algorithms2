import java.util.*;
import java.lang.*;
import java.io.*;

class LeftRight {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int s = 0;
		
		while(s < t) {
			
			int n = sc.nextInt();
			
			int arr[] = new int[n];
			
			for(int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			
			int lmax[] = new int[n];
			lmax[0] = arr[0];
			
			for(int i = 1; i < n; i++) {
				if(lmax[i-1] > arr[i])
					lmax[i] = lmax[i-1];
				else
					lmax[i] = arr[i];
			}
			
			int rmin[] = new int[n];
			rmin[n-1] = arr[n-1];
			
			for(int i = n-2; i >= 0; i--) {
				if(rmin[i+1] < arr[i])
					rmin[i] = rmin[i+1];
				else
					rmin[i] = arr[i];
			}
			
			int flag = 0;
			
			for(int i = 1; i < n-1; i++) {
				if(lmax[i] == rmin[i]) {
					flag = 1;
					System.out.println(arr[i]);
					break;
				}
			}
			if(flag == 0)
				System.out.println("-1");
			
			s++;
		}
	}
}