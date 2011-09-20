import java.io.*;
import java.util.*;
import java.math.*;

public class WhichDay {
	public static String [] weeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	public String getDay(String[] a) {
		String result = "";
		boolean [] b = new boolean[7];
		for (int i = 0; i < 6; i++){
			System.out.println(a[i]);
			if (a[i].equals("Sunday")){
				b[0] = true;
			}else if (a[i].equals("Monday")){
				b[1] = true;
			}else if (a[i].equals("Tuesday")){
				b[2] = true;
			}else if (a[i].equals("Wednesday")){
				b[3] = true;
			}else if (a[i].equals("Thursday")){
				b[4] = true;
			}else if (a[i].equals("Friday")){
				b[5] = true;
			}else if (a[i].equals("Saturday")){
				b[6] = true;
			}
		}
		
		for (int i = 0; i < 7; i++){
			System.out.println(b[i]);
//			if (b[i] == false){
//				return weeks[i];
//			}
		}
		return result;
	}
}
