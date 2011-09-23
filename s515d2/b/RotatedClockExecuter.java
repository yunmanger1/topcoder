import java.io.*;
import java.util.*;

public class RotatedClockExecuter {
	public static void main(String[] args) throws IOException {
        		int hourHand;
		int minuteHand;
        		hourHand = TCReader.readint();
		minuteHand = TCReader.readint();
		System.out.println("==================================================");        
		System.out.println(new RotatedClock().getEarliest(hourHand, minuteHand));
		System.out.println("==================================================");        
	}
}
