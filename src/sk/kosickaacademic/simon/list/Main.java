package sk.kosickaacademic.simon.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(100);
        list.add(60);
        list.add(29);
        list.add(40);


        for(int i=0; i<list.size(); i++) System.out.println(list.get(i));
        System.out.println(list);
        for(int i : list) System.out.println(i);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){ int a=it.next(); System.out.println(a); if(a%2!=0) it.remove(); }
        list.forEach((n)->{ System.out.println(n); });
        list.forEach(Main::write);

        System.out.println();
        System.out.println();
        Collections.sort(list); System.out.println(list);

        Collections.sort(list, ((o1, o2) -> {
            int n1 = digitSum(o1);
            int n2 = digitSum(o2);
            if(n1==n2) return 0;
            else if(n1>n2) return 1;
            else return -1;
            //return Integer.compare(n1,n2);
            //Collections.sort(list, Comparator.comparingInt(Main::digitSum));
        })); System.out.println(list);
    }

    public static int digitSum(int value){
        String temp = String.valueOf(value);
        int result=0;
        for(int i=0; i<temp.length(); i++) result+=Integer.parseInt(String.valueOf(temp.charAt(i)));
        return result;
    }

    public static void write(int value){
        System.out.print(value +" ");
    }
}
