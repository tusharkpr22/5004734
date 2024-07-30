public class Logger {
    // Create a private static instance of Logger
    private static Logger instance;

    // Make the constructor private to prevent instantiation
    private Logger() {
        // Private constructor to prevent instantiation
    }

    // Provide a public static method to get the instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method to demonstrate logging functionality
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

