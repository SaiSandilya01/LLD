package DesignPatterns.Strategy;

class FileStrategy implements LoggingStrategy {
    @Override
    public void log(String message) {
        System.out.println("File log");
    }
}
