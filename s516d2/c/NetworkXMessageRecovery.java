import java.io.*;
import java.util.*;
import java.math.*;

public class NetworkXMessageRecovery {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	static int N = 26+26;
	static boolean  [] used = new boolean[26+26];
	static boolean  [] ex = new boolean[26+26];
	static int [][] a = new int[26+26][26+26];
	static int [] rev = new int[26+26];
	static StringBuffer result;
	public int toInt(char c){
		if (c <= 'Z' && c >= 'A'){
			return c - 'A';
		}
		return c - 'a' + 26;
	}
	public char toChr(int c){
		if (c < 26){
			return (char)(c + 'A');
		}
		return (char)(c - 26 + 'a');
	}
	public String recover(String[] ms) {
		int n = ms.length;
		for (int i = 0; i < n; i++){
			int m = ms[i].length();
			ex[toInt(ms[i].charAt(0))] = true;
			for (int j = 1; j < m; j++){
				int u = toInt(ms[i].charAt(j-1));
				int v = toInt(ms[i].charAt(j));
				if (a[u][v] == 0){
					rev[v]++;
				}
				ex[v] = true;
				a[u][v] = 1;
				//a[v][u] = 1;
			}
		}
		int k = 0;
		for (int i = 0; i < N; i++)if (ex[i])k++;
		result = new StringBuffer();
		while (k != 0){
			int ix = 0;
			for (int u = 0; u < N; u++)if (ex[u] && !used[u] && rev[u] == 0){
				ix = u;
				break;
			}
			result.append(toChr(ix));
			used[ix] = true;
			for (int i = 0; i < N; i++)if (a[ix][i]==1){
				rev[i]--; 
			}
			k--;
		}
		return result.toString();
	}
}
