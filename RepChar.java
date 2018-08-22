import java.util.*;

public class RepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t > 0) {
			
			String s = sc.next();
			
			Map<Character, Integer> hs = new HashMap<Character, Integer>();
			
			Map<Character, Integer> out = new HashMap<Character, Integer>();
			
			for(int i = 0; i < s.length(); i++) {
				
				char c = s.charAt(i);
				
				if(hs.containsKey(c)) {
					int val = hs.get(c);
					val++;
					hs.put(c, val);
				}
				else
					hs.put(c, 1);
				
			}
			
			for(char c : hs.keySet()) {
				
				if(hs.get(c) > 1)
					System.out.print(c + " ");
				
			}
			
			System.out.println();
			t--;
			
			
		}
		

	}

}
