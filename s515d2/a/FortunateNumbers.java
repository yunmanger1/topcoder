import java.io.*;
import java.util.*;
import java.math.*;

public class FortunateNumbers {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	public boolean isf(int x){
		String s = ""+x;
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) != '5' && s.charAt(i) != '8'){
				return false;
			} 
		}
		return true;
	}
	public int getFortunate(int[] a, int[] b, int[] c) {
		TreeSet<Integer> set = new TreeSet<Integer>();		
		for (int aa : a){
			for (int bb : b){
				for (int cc : c){
					if (isf(aa + bb + cc)){
						set.add(aa+bb+cc);
					}
				}
			}
		}
		return set.size();
	}
} 
