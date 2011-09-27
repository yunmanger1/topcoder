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
	double [] P = new double[2];
	int M,B;
	double R = 0;
	double [][] cr = new double[500][500];
	double dive(int w, int l){
		if (!(w < 500 && l < 500)){
			return 0;
		}
		if (w >= M && w-l >= B){
			return 1;
		}
		if (l >= M && l-w >= B){
			return 0;
		}
		if (cr[w][l] != -1){
			return cr[w][l];
		}
		cr[w][l] = P[0]*dive(w+1,l) + P[1]*dive(w,l+1);
		return cr[w][l];
	}
	public double oddsOfWinning(int Mm, int Bb, int skill) {
		P[0] = skill/100.0;
		P[1] = 1 - P[0];
		M = Mm;
		B = Bb;
		for (double [] a : cr){
			Arrays.fill(a,-1);
		}
		return dive(0,0);
	}
}
