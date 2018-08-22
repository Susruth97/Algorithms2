/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Comp implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		// TODO Auto-generated method stub
		return (b+a).compareTo(a+b);
	}
	
	
}


class Large {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<String> al = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
		    al.add(String.valueOf(sc.nextInt()));
		}
		
		Collections.sort(al, new Comp());
		
		String s = "";
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
		    s = s + (String)itr.next();
		}
		
		System.out.println(s);
	}
}