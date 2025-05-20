
public class Main {
public static void main(String[] args) {
// Create a new User
User user = new User("tharindu", "tharindu@example.com", "1234567890", "2000-01-01", "test123");

// Print initial details
System.out.println("Username: " + user.getUsername());
System.out.println("Email: " + user.getEmail());

// Update some info
user.setEmail("test@example.com");
user.setPassword("Test");

// Print updated info
System.out.println("Updated Email: " + user.getEmail());
System.out.println("Updated Password: " + user.getPassword());
}
}


