import java.io.*;
import java.util.*;
import java.math.*;

public class CuttingGrass {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	public int theMin(int[] init, int[] grow, int H) {
		int result = 0;
		int n = init.length;
		int [] d = new int[init.length];
		int mm = Integer.MIN_VALUE;
		int mi = 0;
		long gs = 0;
		long is = 0;
		long sum = 0;
		Obj [] os = new Obj[n];
		for (int i = 0; i < n; i++){
			os[i] = new Obj(i,init[i]+grow[i]);
			sum += os[i].gr;
			is += init[i];
			gs += grow[i];
		}
		if (is <= H){
			return 0;
		}
		if (gs >= H){
			return -1;
		}
		int t = 1;
		is = sum;
		while (true){
			int mx = 0;
			for (int i = 0; i < n; i++){
				if (os[i].gr > os[mx].gr){
					mx = i;
				}
				os[i].gr += grow[i];
			}
			sum -= (os[mx].gr - grow[mx]);
			os[mx].gr = 0;
			_f("%d %d\n",sum, H);
			if (sum <= H){
				return t;
			}
			t += 1;
			if (t > 100 && sum >= is){
				return -1;
			}
		}
	}
	class Obj{
		public int ix;
		public int gr;
		public Obj(int ix, int gr){
			this.ix = ix;
			this.gr = gr;
		}
	}
}
