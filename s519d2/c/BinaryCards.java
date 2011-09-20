import java.io.*;
import java.util.*;
import java.math.*;

public class BinaryCards {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	public long largestNumber(long A, long B) {
		long result = B;
		while (B != 0){
			double pp = Math.log(B)/Math.log(2);
			int p = (int)pp;
			long x = (long)Math.pow(2,p);
			if ((A & x) == x && (B & x) == x){
				B = B ^ x;
				A = A ^ x;
			}else{
				result = result | (long)Math.pow(2,p)-1;
				return result;
			}
		}
		
		return result;
	}
}
