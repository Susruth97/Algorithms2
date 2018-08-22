import java.util.*;
import java.io.*;

public class InSpiral {
	
	static long[] nPrime(long N)
	{
		long[] out = new long[(int)N+1];
		
		int k = 0;
		
		out[k++] = 2;
		int i = 3;
		
		while(k < N) {
			
			int count = 0;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0)
					count++;
			}
			
			if(count == 0) {
				out[k++] = i;
			}
			
			i++;
			
		}
		
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long[] p = new long[(int)n];
		
		p = nPrime(n);
		
		int col = (int)Math.sqrt(Math.ceil((double)n));
		
		if(col % 2 == 0)
			col = col + 1;
		
		int row = col;
		
		long[][] a = new long[row][col];
		
		
		int cs = col/2, ce = col/2 + 1, rs = row/2, re = row/2 +1;
		
		int count = 0, k = 0;
		
		a[row/2][col/2] = p[k++];
		if(count < n) {
			System.out.println("(0,0)");
			count ++;
		}
		
		while(true) {
			
			//System.out.println(count);
			if(ce >= col)
				ce = col -1;
			if(cs < 0)
				cs = 0;
			if(re >= row)
				re = row - 1;
			if(rs < 0)
				rs = 0;
			
			for(int i = cs + 1; i <= ce; i++) {
				a[rs][i] = p[k++];
				int x = rs - row/2, y = i - col/2;
				if(count < n) {
					System.out.println("("+x+","+y+")");
					count++;
				}
			}
				
			cs--;
						
			if(k > n)
				break;
				
			for(int i = rs + 1; i <= re; i++) {
				a[i][ce] = p[k++];
				int x = i - row/2, y = ce - col/2;
				if(count < n) {
				System.out.println("("+x+","+y+")");
				count++;
				}
			}
			rs--;
			
			if(k > n)
				break;
			
			for(int i = ce - 1; i >= cs; i--) {
				a[re][i] = p[k++];
				int x = re - row/2, y = i - col/2;
				if(count < n) {
				System.out.println("("+x+","+y+")");
				count++;
				}
			}
			ce++;
			
			if(k > n)
				break;
			
			for(int i = re - 1; i >= rs; i--) {
				a[i][cs] = p[k++];
				int x = i - row/2, y = cs - col/2;
				if(count < n) {
				System.out.println("("+x+","+y+")");
				count++;
				}
			}
			re++;
			
			if(k > n)
				break;
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
