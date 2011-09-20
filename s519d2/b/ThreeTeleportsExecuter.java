import java.io.*;
import java.util.*;

public class ThreeTeleportsExecuter {
	public static void main(String[] args) throws IOException {
        		int xMe;
		int yMe;
		int xHome;
		int yHome;
		String[] teleports;
        		xMe = TCReader.readint();
		yMe = TCReader.readint();
		xHome = TCReader.readint();
		yHome = TCReader.readint();
		teleports = TCReader.readStringArray();
        
		System.out.println(new ThreeTeleports().shortestDistance(xMe, yMe, xHome, yHome, teleports));
	}
}
