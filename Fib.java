
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fib {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = 0;
        
        while(s < t) {
        	
        	int N = sc.nextInt();
        	int k = sc.nextInt();
        	BigInteger[] arr = new BigInteger[N+1];
        	BigInteger pro = BigInteger.ONE;
        	
        	for(int i = 0; i < k; i++) {
        		int val = sc.nextInt();     		
        		arr[i] = BigInteger.valueOf(val);
        		
        		pro = pro.multiply(arr[i]);
   
        	}
        
        	System.out.println(pro);
        	
            for(int i = k; i < N; i++) {
            	arr[i] = pro;
            	System.out.println(pro);
                pro = (pro.multiply(arr[i])).divide(arr[i-k]);
            }
            
            long d = (long)Math.pow(10, 9) + 7;
            
            BigInteger m= BigInteger.valueOf(d);
            
            BigInteger out = arr[N-1].mod(m);
            
            String ans = out.toString();
            
            //Long l = Long.parseLong(ans);
            
            System.out.println(ans);
            
            s++;
        }
    }
}