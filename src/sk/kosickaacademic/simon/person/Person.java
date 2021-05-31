package sk.kosickaacademic.simon.person;

public class Person {
    private String fName, lName;
    private char gender;
    private int age;

    public Person(String fName, String lName, char gender, int age) {
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
