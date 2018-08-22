import java.util.*;

public class ConsChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char c = sc.next().charAt(0);
		
		int last = -1, flag = 1, count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) != c)
				continue;
			else
				count++;
			
			if(last == -1)
				last = i;
			else {
				if(s.charAt(last) != s.charAt(i-1))
					flag = 0;
			}
			
			if(flag == 0)
				break;
			
		}
		
		if(flag == 1 && count != 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
