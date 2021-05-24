package sk.kosickaacademic.simon;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Milan", 22615101);
        //map.put("Eva", 124124124);
        Attendance attendance = new Attendance(map);
        //attendance.checkDay(15);
        attendance.checkAttendance();
    }
}
