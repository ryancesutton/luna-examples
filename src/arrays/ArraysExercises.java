package arrays;

import java.util.Arrays;

//ARRAYS EXERCISES
public class ArraysExercises {

public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println(numbers);
    System.out.println(Arrays.toString(numbers));

    Person[] people = new Person[3];


    people[0] = new Person("Justin");
    people[1] = new Person("Casey");
    people[2] = new Person("Ry");


    for (int i = 0; i < people.length; i++) {
        System.out.println(people[i].getName());
    }

    people = addPerson(people, new Person("Jeanette"));

    for(Person person : people) {
        System.out.println("Using enhanced for: " + person.getName());
    }

}

    public static Person[] addPerson(Person[] people, Person person) {

        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);

        newPeopleArray[newPeopleArray.length - 1] = person;


        return newPeopleArray;

    }

}
