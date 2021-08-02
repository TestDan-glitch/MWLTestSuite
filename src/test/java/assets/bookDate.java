package assets;

import com.ibm.icu.util.Calendar;

import java.time.LocalDate;
import java.time.Month;

public class bookDate {

    //Getting the current date value
    LocalDate currentdate = LocalDate.now();

    //TODO get current month
    public String getDay() {
        //Getting the current day
        int today = currentdate.getDayOfMonth();

        String todayString=Integer.toString(today);

        //return today;
        return todayString;
    }

    public String getMonth() {
        //Getting the current month
        int month = currentdate.getMonthValue();

        String monthString=Integer.toString(month);

        return monthString;
    }

    public int getDate(){
        //Getting the current date value
//        LocalDate currentdate = LocalDate.now();
//        System.out.println("Current date: " + currentdate);

        //Getting the current day
        int currentDay = currentdate.getDayOfMonth();
//        System.out.println("Current day: " + currentDay);

        //Getting the current month
        Month currentMonth = currentdate.getMonth();
//        System.out.println("Current month: " + currentMonth);

        //getting the current year
        int currentYear = currentdate.getYear();
//        System.out.println("Current month: " + currentYear);

        LocalDate today = LocalDate.now();

//        System.out.println(today.getDayOfWeek());             // SUNDAY
//        System.out.println(today.getDayOfWeek().getValue());  // 7

        int dayOfWeek = today.getDayOfWeek().getValue();

        if (dayOfWeek == 4) { // Thurs
            return currentDay + 4;

        } else if (dayOfWeek == 5) { // Fri
            return currentDay + 3;
        } // Mon, Tue & Wed
            return currentDay;
    }

    public int intDay(){
        Calendar cal = Calendar.getInstance();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;
        String todayString=Integer.toString(dayOfWeek);
       return dayOfWeek;
    }

}

