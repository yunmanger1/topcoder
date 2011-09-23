import java.io.*;
import java.util.*;
import java.math.*;

public class NetworkXOneTimePad {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	public String mxor(String a, String b){
		int n = a.length();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++){
			int aa = a.charAt(i) - '0';
			int bb = b.charAt(i) - '0';
			sb.append((char)('0'+(aa ^ bb)));
		}
		String res = sb.toString();
		return res;
	}
	public int crack(String[] P, String[] C) {
		int m = P.length;
		int c = C.length;
		int n = P[0].length();
		TreeSet<String> set = new TreeSet<String>();
		TreeSet<String> fs = new TreeSet<String>();
		for (int i = 0; i < m; i++){
			fs.add(P[i]);
		}
		int g = 0;
		for (int i = 0; i < m; i++){
		for (int j = 0; j < c; j++)
			set.add(mxor(P[i],C[j]));
		}
		
		for (String key : set){
			for (String cp : C)if (!fs.contains(mxor(cp, key))){
				g++;
				break;
			}
		}
		
		return set.size()-g;
	}
}
