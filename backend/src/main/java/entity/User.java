package entity;
import java.time.Instant;
import java.util.*;

public class User{
    private String firstName;
    private String lastName;
    private UUID id;
    private String mobileNumber;
    private String email;
    private String password;
    private UserRole role; //PATIENT, DOCTOR, ADMIN
    private UserStatus status; //ACTIVE, INACTIVE, LOCKED
    private Instant createdAt;
    private Instant updatedAt;


    public User(String firstName, String lastName, String mobileNumber, String email, String password, UserRole role, UserStatus status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.id = java.util.UUID.randomUUID();
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    public User() {
        //TODO Auto-generated constructor stub
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        this.updatedAt = Instant.now();
    
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        this.updatedAt = Instant.now();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        this.updatedAt = Instant.now();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
        this.updatedAt = Instant.now();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.updatedAt = Instant.now();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        this.updatedAt = Instant.now();
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
        this.updatedAt = Instant.now();
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
        this.updatedAt = Instant.now();
    }
}
