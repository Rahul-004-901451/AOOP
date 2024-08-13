package com.example.logging;

public class Client {
    public static void main(String[] args) {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set up the chain of responsibility
        infoHandler.setNext(debugHandler);
        debugHandler.setNext(errorHandler);

        // Create commands
        LogCommand infoCommand = new LogCommand(infoHandler, LogLevel.INFO);
        LogCommand debugCommand = new LogCommand(debugHandler, LogLevel.DEBUG);
        LogCommand errorCommand = new LogCommand(errorHandler, LogLevel.ERROR);

        // Create logger and add commands
        Logger logger = new Logger();
        logger.addCommand(infoCommand);
        logger.addCommand(debugCommand);
        logger.addCommand(errorCommand);

        // Process log commands
        logger.processCommands();
    }
}
