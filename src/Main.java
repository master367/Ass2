import java.util.ArrayList;
import java.util.Collections;

interface Payable {
    double getPaymentAmount();
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Employee("Jordan", "Belfort", "broker", 34526.14));
        peopleList.add(new Employee("Hannibal", "Lector", "psychologist", 930913.00));
        peopleList.add(new Student("Petr" ,"Adzhikov", 0.7));
        peopleList.add(new Student("Assyl", "Didarov", 3.7));


        Collections.sort(peopleList);

        printData(peopleList);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
