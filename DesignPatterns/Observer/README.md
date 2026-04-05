# Observer Pattern

The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects. When the state of one object (the **Subject**) changes, all its dependents (**Observers**) are notified and updated automatically.

### Key Concepts:
1.  **Subject**: The object that holds the state (e.g., `WeatherStation`) and manages a list of subscribers.
2.  **Observer**: An interface that any object wishing to receive updates must implement.
3.  **Loose Coupling**: The Subject doesn't need to know the concrete types of its observers; it only knows they implement the `Observer` interface.

This pattern is highly useful for event-driven systems and UI frameworks.
