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
	static double [] P = new double[2];
	static int M,B;
	static int [] st = new int[100];
	static double R = 0;
	public void writeout(int n, double p){
		for (int i = 0; i < n; i++){
			_f("%d",st[i]);
		}
		_f(" %.9f",p);
		_("");
	}
	public void dive(double p, int d, int l){		
		if (p < 1e-9){
			return;
		}
		int w = d - l;
		if (Math.abs(w-l) >= B && (w >= M || l >= M)){
			if (w >= M){
//				writeout(d,p);
				R+=p;
			}
		}else{
			for (int i = 0; i < 2; i++){
				st[d] = i;
				dive(p*P[i],d+1,l+i);
			}
		}
	}
	public double oddsOfWinning(int Mm, int Bb, int skill) {
		P[0] = skill/100.0;
		P[1] = 1 - P[0];
		M = Mm;
		B = Bb;
		dive(1,0,0);
		return R;
	}
}
