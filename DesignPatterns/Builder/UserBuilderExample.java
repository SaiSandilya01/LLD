package DesignPatterns.Builder;

// 1. The Complex Object
class User {
    private final String firstName; // Required
    private final String lastName;  // Required
    private final String email;     // Optional
    private final String phone;     // Optional

    // Package-private constructor so objects are made through the Builder
    protected User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName + (email != null ? " (" + email + ")" : "");
    }
}

// 2. The Builder
class UserBuilder {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phone;

    // Required fields in the Builder's constructor
    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this; // This allows for chaining!
    }

    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this; // This allows for chaining!
    }

    public User build() {
        return new User(this);
    }
}

public class UserBuilderExample {
    public static void main(String[] args) {
        // Look how clean and readable this is now!
        User user = new UserBuilder("John", "Doe")
                .setEmail("john.doe@example.com")
                .setPhone("123-456-7890")
                .build();

        System.out.println(user);

        // Building with only required fields
        User simpleUser = new UserBuilder("Jane", "Smith").build();
        System.out.println(simpleUser);
    }
}
