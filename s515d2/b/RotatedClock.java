import java.io.*;
import java.util.*;
import java.math.*;

public class RotatedClock {
	public static void _(String s){
	    System.out.println(s);
	}
	public static void _f(String fmt, Object ... args){
	    System.out.printf(fmt, (Object[])args);
	}
	public String getEarliest(int hourHand, int minuteHand) {
		String result = "";
		int rh = 0;
		int rm = 0;
		String fmt = "%02d:%02d";
		for (int i = 0; i < 12; i++){
			int h = ((30*i+hourHand) % 360) / 30;
			double he = ((30*i+hourHand) % 360) % 30;
			double m = ((30*i+minuteHand) % 360) / 6.0;
			if (he*2 == m){
				return String.format(fmt, h,(int)m);
			}						
		}
		return result;
	}
}
