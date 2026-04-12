package DesignPatterns.Strategy;

class ConsoleStrategy implements LoggingStrategy {

    @Override
    public void log(String message) {
        System.out.println("console log");
    }

}