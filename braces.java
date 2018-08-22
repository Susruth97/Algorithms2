import java.io.*;
import java.util.*;

public class braces {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int k = 0;
        
        while(k < t) {
            
            String s = sc.nextLine();
            
            //System.out.println(s);
            
            if(s.charAt(0) == '{') {
                if(s.charAt(s.length()-1) != '}') {
                    System.out.println("Compilation Errors");
                    break;
                }
            }
            
            
            Stack<Character> q = new Stack<>();
            
            int i = 0, p = 0, m = 0, mc = 0, f = 0, flag = 1;
            
            while(i < s.length()) {
                                
                if(s.charAt(i) == '<') {
                    m = 1;
                    mc++;
                    if(mc > 1) {
                        flag = 0;
                        break;
                    }
                    q.push('>');
                }
                else if(s.charAt(i) == '{') {
                    if(f == 0 && m == 0 && i != 0) {
                    	flag = 0;
                    	break;
                    }
                    q.push('}');
                }
                else if(s.charAt(i) == '(') {
                    f = 1;
                    q.push(')');
                }
                else if(s.charAt(i) == 'P') {
                    p++;
                    if(p > 100) {
                        flag = 0;
                        break;
                    }
                }
                else {
                    
                    if(q.empty()) {
                        flag = 0;
                        break;
                    }
                    
                    if(s.charAt(i) == '>')
                        m = 0;
                    else if(s.charAt(i) == ')')
                        f = 0;
                    
                    if(s.charAt(i) != q.pop()) {
                        flag = 0;
                        break;
                    }
                    
                    
                }
                
                i++;
                
            }
            
            
            if(flag == 1 && q.empty() && mc == 1)
                System.out.println("No Compilation Errors");
            else
                System.out.println("Compilation Errors");
            
            k++;
                       
        }
        
    }
}