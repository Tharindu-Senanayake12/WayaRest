public class User {

private String username;
private String email;
private String phone;
private String dob; // Consider using LocalDate for real apps
private String password;

// Constructor
public User(String username, String email, String phone, String dob, String password) {
this.username = username;
this.email = email;
this.phone = phone;
this.dob = dob;
this.password = password;
}

// Getters
public String getUsername() {
return username;
}

public String getEmail() {
return email;
}

public String getPhone() {
return phone;
}

public String getDob() {
return dob;
}

public String getPassword() {
return password;
}

// Setters
public void setUsername(String username) {
this.username = username;
}

public void setEmail(String email) {
this.email = email;
}

public void setPhone(String phone) {
this.phone = phone;
}

public void setDob(String dob) {
this.dob = dob;
}

public void setPassword(String password) {
this.password = password;
}
}