import java.io.*;
import java.util.*;

public class NetworkXZeroOneExecuter {
	public static void main(String[] args) throws IOException {
        		String message;
        		message = TCReader.readString();
		System.out.println("==================================================");        
		System.out.println(new NetworkXZeroOne().reconstruct(message));
		System.out.println("==================================================");        
	}
}
