package OOPS;

// The interface hides the complex implementation details
interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        // Complex connection logic here
        System.out.println("Connecting to MySQL natively...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // We only interact with the abstraction (Database)
        // We do not need to know HOW MySQL connects, only THAT it connects.
        Database db = new MySQLDatabase();
        db.connect(); 
    }
}
