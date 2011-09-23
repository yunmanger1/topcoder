import java.io.*;
import java.util.*;
import java.math.*;

public class NewItemShopTwo {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	public double getMaximum(String[] cus) {
		double result = 0.0;
		
		List<Obj> lst = new ArrayList<Obj>();
		int k = 0;
		String [] ss = cus[0].split(" ");
		for (String e : ss){
			String [] s = e.split(",");
			Obj o = new Obj();
			o.h = Integer.parseInt(s[0]);
			o.c = Integer.parseInt(s[1]);
			o.p = Integer.parseInt(s[2]);
			o.cc = 1;
			lst.add(o);
		}
		for (String e: cus[1].split(" ")){
			String [] s = e.split(",");
			Obj o = new Obj();
			o.h = Integer.parseInt(s[0]);
			o.c = Integer.parseInt(s[1]);
			o.p = Integer.parseInt(s[2]);
			o.cc = 1;
			lst.add(o);
		}
		Collections.sort(lst);
		int n = lst.size();
		for (int i = 0; i < n; i++){
			Obj o = lst.get(i);
			_f("%d %d %d %d\n",o.h, o.p, o.c, o.cc);
		}		
		return result;
	}
	class Obj implements Comparable<Obj>{
		public int h,p,c,cc;
		public int compareTo(Obj o){
			return this.h - o.h;
		}
	}
}
