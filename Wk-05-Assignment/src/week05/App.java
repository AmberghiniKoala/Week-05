package week05;

public class App {

	public static void main(String[] args) {
		
		System.out.println("---AsteriskLogger---\n");
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Log");
		System.out.println();
		logger.error("Error");
		
		System.out.println("\n---SpacedLogger---\n");
		
		Logger logger2 = new SpacedLogger();
		
		
		logger2.log("Log");
		System.out.println("\n");
		logger2.error("Error");

	}

}
