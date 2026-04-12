package DesignPatterns.Strategy;

public class Logger {
    private LoggingStrategy strategy;

    public Logger(LoggingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(LoggingStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(String message) {
        this.strategy.log(message);
    }

    public static void main(String[] args) {
        Logger logger = new Logger(new ConsoleStrategy());
        String message = "Logging";
        logger.process(message);
        logger.setStrategy(new FileStrategy());
        logger.process(message);

    }
}
