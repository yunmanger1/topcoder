import java.io.*;
import java.util.*;

public class WhichDayExecuter {
	public static void main(String[] args) throws IOException {
        		String[] notOnThisDay;
        		notOnThisDay = TCReader.readStringArray();
        
		System.out.println(new WhichDay().getDay(notOnThisDay));
	}
}
