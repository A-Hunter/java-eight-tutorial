package entities;

/**
 * Created by Ghazi Ennacer on 13/04/2017.
 */
public class Person {
    public final String lastName;
    public final String firstName;
    public final Integer age;
    public final String occupation;

    public Person(final String lastName, final String firstName,
                  final Integer age, final String occupation) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.occupation = occupation;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
