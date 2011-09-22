import java.io.*;
import java.util.*;
import java.math.*;

public class MonochromaticBoard {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	static final int W = 0;
	static final int B = 1;
	static int [][] a;
	static int [] row;
	static int [] col;
	static int n, m;

	public int theMin(String[] board) {
		n = board.length;
		m = board[0].length();
		a = new int[n][m];
		row = new int[n];
		col = new int[m];
		boolean ok = false;
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				a[i][j] = (board[i].charAt(j) == 'W' ? 0 : 1);
				if (a[i][j] == W){
					row[i] = B;
					col[j] = B;
					ok = true;
				}
			}
		}
		int R = 0;
		for (int i = 0; i < n; i++)if (row[i] == W){
			R+=1;
		}

		for (int i = 0; i < m; i++)if (col[i] == W){
			R+=1;
		}
		
		if (!ok){
			R = Math.min(R, Math.min(n,m));
		}
		
		return R;
	}
}
