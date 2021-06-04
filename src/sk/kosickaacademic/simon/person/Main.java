package sk.kosickaacademic.simon.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Joseph", "Stalin", 'm', 52));
        list.add(new Person("Milan", "Zapatý", 'm', 24));
        list.add(new Person("Zuzana", "Malá", 'f', 18));
        list.add(new Person("Andrej", "Zapatý", 'm', 22));
        list.add(new Person("Jozefina", "Zelená", 'f', 60));
        list.add(new Person("Adolf", "Hitler", 'm', 36));
        list.add(new Person("Jana", "Rudá", 'f', 52));
        list.add(new Person("Adam", "Michalik", 'm', 78));
        list.add(new Person("Robert", "Downey", 'm', 53));
        list.add(new Person("Daniela", "Zelená", 'f', 35));
        List<Person> femaleList = formFemaleList(list);
        //List<Person> femaleList = list.stream().filter(p -> p.getGender()=='f').collect(Collectors.toList());
        //sortByAge(list);
        //sortByName(list);
        //Collections.shuffle(list);
        List<Person> ageList = list.stream().filter(p -> p.getAge()<20).collect(Collectors.toList());
        printList(list);
    }

    public static void printList(List<Person> list){
        list.forEach(p -> {
            System.out.println(p.getfName().charAt(0) +". " +p.getlName() +" " +p.getGender() +" " +p.getAge() +" (" +p.hashCode(p.getlName()) +")");
        });
    }

    public static List formFemaleList(List<Person> list){
        List<Person> femaleList = new ArrayList<>();
        list.forEach(p -> {
            if(p.getGender()=='f') femaleList.add(p);
        });
        return femaleList;
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
