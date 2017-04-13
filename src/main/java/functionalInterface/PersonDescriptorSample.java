package functionalInterface;

import consumer.person.Person;

/**
 * Created by Ghazi Ennacer on 14/04/2017.
 */
public class PersonDescriptorSample implements PersonDescriptor {
    @Override
    public String describe(Person person) {
        StringBuilder sb = new StringBuilder(person.lastName)
                .append("-")
                .append(person.firstName)
                .append("-")
                .append(person.age)
                .append("-")
                .append(person.occupation);

        return sb.toString();
    }

    public static void main(String[] args) {
        Person person = new Person("Isaac", "Netero", 125, "Hunter");
        PersonDescriptorSample descriptorSample = new PersonDescriptorSample();

        String finalDescription = descriptorSample.describe(person);
        String s = descriptorSample.addDescription(finalDescription,
                "The chief of the hunters organizations. This description was written in : "
                        + descriptorSample.currentTime());
        System.out.println(s);

    }
}
