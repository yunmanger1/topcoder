import java.io.*;
import java.util.*;
import java.math.*;

public class ChessKnight {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	final static int [] dx = {-2, -2, -1, 1, 2, 2, 1, -1};
	final static int [] dy = {-1, 1, 2, 2, 1, -1, -2, -2};
	public double probability(int x, int y, int n){
		int lx = 2, rx = 10, ly = 2, ry = 10;
		double [][][] d = new double[12][12][2];
		double P = 1/8.0;
		d[x+1][y+1][0] = 1;
		for (int l = 0, k = 0; l < n; l++, k=1-k){
		
			for (int i = lx; i < rx; i++){
				for (int j = ly; j < ry; j++)if (d[i][j][k] != 0){
					for (int v =0; v < 8; v++){
						int tx = i + dx[v];
						int ty = j + dy[v];
						d[tx][ty][1-k] += d[i][j][k] * P;
					}
				}
			}
			for (int i = lx; i < rx; i++){
				for (int j = ly; j < ry; j++){
					d[i][j][k] = 0;
				}
			}
		}
		double s = 0;
		for (int i = lx; i < rx; i++){				
			for (int j = ly; j < ry; j++){
				if (d[i][j][n%2] != 0) s+=d[i][j][n%2];
			}
		}
		return s;
	}
}
