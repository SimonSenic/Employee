package sk.kosickaacademic.simon;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

public class Attendance {
    Map<String, Integer> map;

    public Attendance(Map<String, Integer> map) {
        this.map = map;
    }

    public void checkDay(int day){
        day-=1;
        for(Map.Entry<String, Integer> entry : map.entrySet())
            if ((entry.getValue() & (int) Math.pow(2, day)) > 0) System.out.println("Y");
            else System.out.println("N");
    }

    public void checkAttendance(){
        //int days = new GregorianCalendar().getActualMaximum(Calendar.DAY_OF_MONTH);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            String num = Integer.toBinaryString(entry.getValue());
            int count = 1;
            for(int i=num.length()-1; i>=0; i--){
                Date date = new Date(count, Calendar.MONTH, Calendar.YEAR);
                String day = date.toString().substring(0, 3);
                if(num.charAt(i)=='0') System.out.println(count +": " +"N " +day);
                else System.out.println(count +": " +"Y " +day);
                count++;
            } //15x15 defaultne nuly, 2 hrači piškvorky, (jednotky a dvojky)
        }
    }
}
