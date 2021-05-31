package sk.kosickaacademic.simon.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Joseph", "Stalin", 'm', 52));
        list.add(new Person("Milan", "Zapatý", 'm', 24));
        list.add(new Person("Zuzana", "Malá", 'z', 18));
        list.add(new Person("Andrej", "Zapatý", 'm', 22));
        list.add(new Person("Jozefina", "Zelená", 'z', 60));
        list.add(new Person("Adolf", "Hitler", 'm', 36));
        list.add(new Person("Jana", "Rudá", 'z', 52));
        list.add(new Person("Adam", "Michalik", 'm', 78));
        list.add(new Person("Robert", "Downey", 'm', 53));
        list.add(new Person("Daniela", "Zelená", 'z', 35));
        //sortByAge(list);
        sortByName(list);
        printList(list);
    }

    public static void printList(List<Person> list){
        list.forEach(p -> {
            System.out.println(p.getfName().substring(0, 1) +". " +p.getlName() +" " +p.getGender() +" " +p.getAge());
        });
    }

    public static void sortByAge(List<Person> list){
        Collections.sort(list, ((o1, o2) -> {
            int age1 = o1.getAge();
            int age2 = o2.getAge();
            return Integer.compare(age1, age2);
        }));
    }

    public static void sortByName(List<Person> list){
        Collections.sort(list, ((o1, o2) -> {
            String lName1 = o1.getlName();
            String lName2 = o2.getlName();
            if(lName1.equals(lName2))
                return String.CASE_INSENSITIVE_ORDER.compare(o1.getfName(), o2.getfName());
            return String.CASE_INSENSITIVE_ORDER.compare(lName1, lName2);
        }));
    }
}
