import java.io.*;
import java.util.*;
import java.math.*;

public class ThreeTeleports {
	static int m = 0;
	static long [] x1;
	static long [] y1;
	static long [] x2;
	static long [] y2;
	static int [] b;
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	public long d(long sx, long sy, long fx, long fy){
		return Math.abs(sx-fx) + Math.abs(sy- fy);
	}
	public long go(long sx, long sy, long fx, long fy){
		long r = d(sx, sy, fx, fy);
		long result = 0;
		for (int i = 0; i < m; i++)if (b[i] == 0){
			b[i] = 1;
			result = d(sx, sy, x1[i], y1[i]) + 10 + go(x2[i], y2[i], fx, fy);
			if (result < r){
				r = result;
			}
			result = d(sx, sy, x2[i], y2[i]) + 10 + go(x1[i], y1[i], fx, fy);
			if (result < r){
				r = result;
			}
			b[i] = 0;
		}
		return r;
	}
	public int shortestDistance(int xMe, int yMe, int xHome, int yHome, String[] ts) {
		long result = 0;
		m = ts.length;
		x1 = new long[m];
		y1 = new long[m];
		x2 = new long[m];
		y2 = new long[m];
		b = new int[m];
		for (int i = 0; i < ts.length; i++){
			b[i] = 0;
			String [] t = ts[i].split(" ");
			x1[i] = Integer.parseInt(t[0]);
			y1[i] = Integer.parseInt(t[1]);
			x2[i] = Integer.parseInt(t[2]);
			y2[i] = Integer.parseInt(t[3]);
		}
		long r = go(xMe, yMe, xHome, yHome);
		return (int)r;
	}
}
