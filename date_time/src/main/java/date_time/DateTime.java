/*
1.Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.
2.
LocalDate               Represents a date (year, month, day (yyyy-MM-dd))
LocalTime               Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime   	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects

3.To display the current date, import the java.time.LocalDate class, and use its now() method:

 */
package date_time;
//import java.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] a) {
//        LocalDate myObj = new LocalDate.now();
        LocalDate myObj = LocalDate.now();  // Create a date object
        System.out.println(myObj);

        LocalTime myObj2 = LocalTime.now();  // Create a date object
        System.out.println(myObj2);

        LocalDateTime myObj3 = LocalDateTime.now();  // Create a date object
        System.out.println(myObj3);

//        DateTimeFormatter myObj4 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // Create a date object
//            DateTimeFormatter myObj4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // Create a date object
                DateTimeFormatter myObj4 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss"); // Create a date object
        String myObj5 = myObj3.format(myObj4);  
        System.out.println(myObj5);
    }

}
