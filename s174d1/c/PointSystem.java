// NOT SOLVED YET
import java.io.*;
import java.util.*;
import java.math.*;

public class PointSystem {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	public long cnk(int n, int k){
		long r = 1;
		for (int i = k+1; i <= n; i++){
			r *= i;
		}
		for (int i = 2; i <=k; i++)
			r/=i;
		return r;
	}
	public double oddsOfWinning(int M, int B, int skill) {
		double P = skill/100.0;
		int MX = 20;
		double [][] pp = new double[MX][MX];
		double r = 0.0;

		for (int x = 0; x < MX/2; x++){
			for (int y = 0; y < MX/2; y++)if (x >= M || y >= M){
				int d = Math.abs(x-y);
				if (d > B && Math.max(x,y) > M)
					continue;
				if (d < B)
					continue;

				//_f("%d %d\n",x,y);
				long Z = cnk(M+B,B);
				double t = Z * Math.pow(P,x) * Math.pow(1-P,y);
				pp[x][y] = t;
				if (x >= M && x > y){
					_f("%d %d c%d %.9f\n",x,y,Z,t);
					r+=t;
				}
			}
		}
		
		return r;
	}
}
