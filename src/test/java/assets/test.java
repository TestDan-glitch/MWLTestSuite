package assets;

import ch.qos.logback.classic.util.LogbackMDCAdapter;
import com.ibm.icu.util.Calendar;
import cucumber.api.java.it.Date;

public class test {

    public static void main(String[] args) {
        bookDate bookingDate = new bookDate();
        System.out.println(bookingDate.getDate());
        System.out.println(bookingDate.getMonth());

//        Date today = new Date(); // Fri Jun 17 14:54:28 PDT 2016
        Calendar cal = Calendar.getInstance();

//        cal.setTime(today); // don't forget this if date is arbitrary e.g. 01-01-2014

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 6

        System.out.println(bookingDate.intDay());
    }
}
