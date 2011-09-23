import java.io.*;
import java.util.*;
import java.math.*;

public class NetworkXZeroOne {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	public String reconstruct(String m) {
		StringBuffer r = new StringBuffer();
		int n = m.length();
		int opos = m.indexOf('o');
		int xpos = m.indexOf('x');
		if (opos == -1 && xpos == -1){
			if (m.length() == 0){
				return m;
			}
			int k = 0;
			for (int i = 0; i < n; i++){
				if (k == 0){
					r.append('o');						
				}else{
					r.append('x');
				}
				k = 1 -k;
			}
			return r.toString();
		}else{
			int x = 0; 
			if (opos != -1){
				if (opos % 2 == 0)
					x = 1;
			}else{
				x = xpos % 2;
			}
			for (int i = 0; i < n; i++)if (m.charAt(i) == '?'){
				if (i % 2 == x){
					r.append('x');
				}else{
					r.append('o');
				}
			}else{
				r.append(m.charAt(i));
			}
		}
		return r.toString();
	}
}
