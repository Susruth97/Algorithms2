
import java.util.*;

public class Reverse {

	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
				
		int t = sc.nextInt();
				
		int l = 0;
				
		while(l < t) {
					
			String st = sc.next();
					
			System.out.println(revWord(st));
					
			l++;
		}

	}

	public static String revWord(String st) {
		
		String[] s = st.split("\\.");
		
		int len = s.length;
		
		String out = "";
		
		int i = 0;
		for(String a : s) {
			
			String rev = rev(a);
			
			out = out + rev;
			
			if(i != len - 1)
				out = out + ".";
			
			i++;
			
		}
		
		return out;
	}
	
	public static String rev(String st) {
		
		char[] arr = st.toCharArray();
		
		int i = 0, j = arr.length - 1;
		
		while(i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		String rev = new String(arr);		
		return rev;
	}
	
}
