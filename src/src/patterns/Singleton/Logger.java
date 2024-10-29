package patterns.Singleton;/*
* Deign Goals:
*       1. Single Instance: The `patterns.Singleton.Logger` should be instantiated only once throughout the application's lifetime.
*       2. Thread-Safe: If the application is multithreaded, ensure that multiple threads don't create duplicate
*           patterns.Singleton.Logger instances.
*       3. Global Access: The single patterns.Singleton.Logger instance should be accessible globally.
*       4. Simple Logging Mechanism: For demonstration purposes, we'll log messages to the console, but this could
*           be easily expanded to log to a file or external service.
*
* */

public class Logger {
    // Private static instance of the patterns.Singleton.Logger (volatile for thread safety)
    private static volatile Logger instance = null;
}
