# Builder Pattern

The Builder Pattern is a creational design pattern that allows you to construct complex objects step by step. It is especially useful when an object has many optional fields.

### Key Benefits:
1.  **Readability**: Avoids "Telescoping Constructors" where you have a long list of parameters and many null values.
2.  **Immutability**: You can make all fields in the final object (e.g., `User`) final, while still having a flexible way to set them during construction.
3.  **Fluent Interface**: By returning `this` in every setter, you can "chain" methods together with a clean dot `.` notation.

Use this pattern whenever an object requires many interdependent steps to create, or when a constructor becomes unmanageably large.
