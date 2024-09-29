import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateandTime {
    public static void main(String[] args){
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before Formatting: " + myDateObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After Formatting: " + formattedDate);
    }
}
//You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects
