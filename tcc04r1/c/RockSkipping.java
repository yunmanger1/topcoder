import java.io.*;
import java.util.*;
import java.math.*;

public class RockSkipping {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	static boolean [] P;
	static int N;
	public double probability(String pads, int maxDist) {
		double result = 0.0;
		N = pads.length();
		P = new boolean[N];
		boolean ok = true;
		for (int i = 0; i < N; i++){
			P[i] = pads.charAt(i) == 'X';
			ok = ok && (pads.charAt(i) != 'X');
		}
		if (ok){
			return 100;
		}
		double [][] dp = new double[maxDist+1][N];
		dp[0][0] = 1;
		for (int i = 0; i <= maxDist; i++){
			int pw = maxDist - i;
			double p = 1/(double)pw;
			for (int j = 0; j < N; j++)if (dp[i][j] != 0 && !P[j]){
				for (int k = 1; k <= pw; k++){
					int x = (j+k) % N;
					dp[i+1][x] += dp[i][j]*p;
				}
			}else{
				result += dp[i][j];
			}
		}

		return (1-result)*100;
	}
}
