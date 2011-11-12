public class CountingSeries{
	public long countThem(long a, long b, long c, long d, long B){
		long z = c;
		long g= 0, k = 0;
		if (c <= B){
			k = 1;
		}
		long xx = (z-a)/b;
		if (xx >= 0 && a+b*xx <= B && a+b*xx == z){
			g++;
		}
		if (d != 1){
			while(z <= B/d){
				z = z*d;
				long x = (z-a)/b;
//				System.out.println(z + " " + x);
				if (x >= 0 && a+b*x <= B && a+b*x == z){
					g++;
				}
				k++;
			}
		}
		long q = (B-a)/b+1;
//		System.out.println(k + " " + q + " " + g);
		return k+q-g;
	}
}
