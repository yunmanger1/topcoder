import java.io.*;
import java.util.*;
import java.math.*;

public class DiceThrows {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	public double winProbability(int n, int[] A, int m, int[] B) {
		int Amax = Integer.MIN_VALUE;
		int Bmax = Integer.MIN_VALUE;
		for (int e : A){
			if (e > Amax){
				Amax = e;
			}
		}
		for (int e : B){
			if (e > Bmax){
				Bmax = e;
			}
		}
		int N = n*Amax+Amax;
		int M = m*Bmax+Bmax;
		double [][] PA = new double[N][2];
		double [][] PB = new double[M][2];
		PA[0][0] = 1;
		for (int i = 0, k = 0; i < n; i++, k=1-k){
			for (int j = 0; j < N; j++)if (PA[j][k] != 0){
				for (int v = 0; v < 6; v++){
					PA[j+A[v]][1-k] += PA[j][k]/6.0;
				}
				PA[j][k] = 0;  	
			}
		}


		PB[0][0] = 1;
		for (int i = 0, k = 0; i < m; i++, k=1-k){
			for (int j = 0; j < M; j++)if (PB[j][k] != 0){
				for (int v = 0; v < 6; v++){
					PB[j+B[v]][1-k] += PB[j][k]/6.0;
				}
				PB[j][k] = 0;  	
			}
		}
		
		double [] sa = new double[N];
		int n2 = n%2;
		sa[N-1] = PA[N-1][n2];
		for (int i = N-2; i >= 0; i--){
			sa[i] = sa[i+1] + PA[i][n2];			
		}
		
		double r = 0;
		int m2 = m%2;
		for (int i = 0; i < M; i++)if(PB[i][m2] != 0){
			if (i+1< N){
				r += PB[i][m2] * sa[i+1];
			}
		}
		return r;
	}
}
