import java.io.*;
import java.util.*;

public class DiceThrowsExecuter {
	public static void main(String[] args) throws IOException {
        		int numDiceA;
		int[] sidesA;
		int numDiceB;
		int[] sidesB;
        		numDiceA = TCReader.readint();
		sidesA = TCReader.readintArray();
		numDiceB = TCReader.readint();
		sidesB = TCReader.readintArray();
		System.out.println("==================================================");        
		System.out.println(new DiceThrows().winProbability(numDiceA, sidesA, numDiceB, sidesB));
		System.out.println("==================================================");        
	}
}
