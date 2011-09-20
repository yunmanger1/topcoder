import java.io.*;
import java.util.*;
import java.math.*;

public class ThreeTeleports {
	static long m = 0;
	static long [] x1;
	static long [] y1;
	static long [] x2;
	static long [] y2;
	static int [] b;
	public long d(long sx, long sy, long fx, long fy){
		return Math.abs(sx-fx) + Math.abs(sy- fy);
	}
	public long go(long sx, long sy, long fx, long fy){
		long r = d(sx, sy, fx, fy);
		long result = 0;
		for (int i = 0; i < m; i++)if (b[i] == 0){
			b[i] = 1;
			result = d(sx, sy, x1[i], y1[i]) + 10 + go(x2[i], y2[i], fx, fy);
			if (r > result){
				r = result;
			}
			b[i] = 0;
		}
		return r;
	}
	public int shortestDistance(int xMe, int yMe, int xHome, int yHome, String[] ts) {
		long result = 0;
		long m = ts.length;
		x1 = new long[ts.length];
		y1 = new long[ts.length];
		x2 = new long[ts.length];
		y2 = new long[ts.length];
		b = new int[ts.length];
		for (int i = 0; i < ts.length; i++){
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
