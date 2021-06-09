package sk.kosickaacademic.simon.person;

import java.util.*;

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

    public static int hashCode(String text){
        if(text==null || text.equals("")) return 0;
        String code = "";
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
        for(int i=0; i<text.length(); i++)
            if(vowels.contains(text.toLowerCase().charAt(i))) code+=1;
            else code+=0;
        return Integer.parseInt(code,2);
    }
}
