import java.util.Objects;

public class Entry {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Entry(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // an override of toString()


    @Override
    public String toString() {
        // below is a text block
        // we can use triple double-quotes to make them
        // text blocks do not need escape characters
        // they can still use formatting!
        return """
                |-------------
                |    Entry    
                |-------------
                | first name: %s
                | last name: %s
                | phone number: %s
                | email address: %s
                """.formatted(firstName, lastName, phoneNumber, emailAddress);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(firstName, entry.firstName) && Objects.equals(lastName, entry.lastName) && Objects.equals(phoneNumber, entry.phoneNumber) && Objects.equals(emailAddress, entry.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phoneNumber, emailAddress);
    }

}
