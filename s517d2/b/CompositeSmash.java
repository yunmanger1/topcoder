import java.io.*;
import java.util.*;
import java.math.*;

public class CompositeSmash {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	public boolean solve(int N, int t){
		if (N == t) return true;
		if (N % t != 0){
			return false;
		}
		if (t == 2){
			return true;
		}
		int rl = (int)Math.sqrt(N);
		for (int i = 2; i <= rl; i++)if (N % i == 0){
			if (!solve(N/i, t) && !solve(i, t)) return false;
		}
		return true;
	}
	public String thePossible(int N, int target) {
		String result = "Yes";
		if (!solve(N,target)){
			return "No";
		}
		return result;
	}
}
