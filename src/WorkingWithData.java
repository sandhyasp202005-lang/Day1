import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithData {
    static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("Date:"+date);
        LocalTime time= LocalTime.now();
        System.out.println("Time:"+time);
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("Date & Time:"+dateTime );

        /* Display the day of the month
        Display the day of the Year
        Display the Week Name,Month Name,Month Number
        E-Name of the Day : (Mon-Sun)
        D-Day of the Year (1-366)
        dd-Day of the month (1-31)
        M-Month Number (1-12)
        MMM-Month name-Jan-Dec
 */
        DateTimeFormatter format=DateTimeFormatter.ofPattern
                ("D,MMM dd yyy");
        String formattedDateTime=dateTime.format(format);
        System.out.println("Formatted Date:"+formattedDateTime);

    }
}
