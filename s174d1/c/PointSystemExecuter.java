import java.io.*;
import java.util.*;

public class PointSystemExecuter {
	public static void main(String[] args) throws IOException {
        		int pointsToWin;
		int pointsToWinBy;
		int skill;
        		pointsToWin = TCReader.readint();
		pointsToWinBy = TCReader.readint();
		skill = TCReader.readint();
		System.out.println("==================================================");        
		System.out.println(new PointSystem().oddsOfWinning(pointsToWin, pointsToWinBy, skill));
		System.out.println("==================================================");        
	}
}
