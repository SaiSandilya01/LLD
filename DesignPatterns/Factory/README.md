# Factory Pattern

The core idea of the Factory Pattern is to separate the object creation logic out of the core business logic. 

Instead of your main service using the `new` keyword and messy `if-else` blocks to instantiate specific classes, you create a dedicated **Factory** class. The service passes a parameter (like a string or enum) to the Factory, and the Factory evaluates it, instantiates the concrete class, and returns it as an Interface.

This heavily promotes the **Single Responsibility Principle**, as the main service handles business logic, and the Factory handles object creation.
