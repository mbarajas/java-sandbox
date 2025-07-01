import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Jane Doe");
        person.setAge(25);
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Example of creating a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 28));
        people.add(new Person("Bob", 35));
        for (Person p : people) {
            System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
        }

        // Example of using a method to find a person by name
        Person foundPerson = findPersonByName(people, "Alice");
        if (foundPerson != null) {
            System.out.println("Found Person: " + foundPerson.getName() + ", Age: " + foundPerson.getAge());
        } else {
            System.out.println("Person not found");
        }

        // Example of using a ternary operator
        String ageCategory = (person.getAge() < 18) ? "Minor" : "Adult";
        System.out.println("Age Category: " + ageCategory);

        int number = 10;
        String testString = "lalala";
        boolean isEven = (number % 2 == 0) ? true : false;
        char m = 'm';
        Person[] persons = new Person[5];

    }

    public static Person findPersonByName(List<Person> people, String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null; // Return null if not found
    }
}
