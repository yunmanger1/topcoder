import java.io.*;
import java.util.*;

public class NetworkXMessageRecoveryExecuter {
	public static void main(String[] args) throws IOException {
        		String[] messages;
        		messages = TCReader.readStringArray();
		System.out.println("==================================================");        
		System.out.println(new NetworkXMessageRecovery().recover(messages));
		System.out.println("==================================================");        
	}
}
