import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;

    Author() {

    }

    Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String toString() {
        return "Имя " + firstName + " Фамилия" + secondName;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Author author) {
        return this.firstName == author.firstName &&
                this.secondName == author.secondName;
    }
}
