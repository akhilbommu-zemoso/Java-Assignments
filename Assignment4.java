import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        Date startDate, endDate;
        while(i < n) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date signUpDate = simpleDateFormat.parse(scanner.next());
            Date currentDate = simpleDateFormat.parse(scanner.next());
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(signUpDate);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(currentDate);
            if (calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR)) {
                System.out.println("No Range");
            } else {
                calendar1.add(Calendar.DATE, -30);
                calendar1.set(Calendar.YEAR, calendar2.get(Calendar.YEAR));
                startDate = calendar1.getTime();
                calendar1.add(Calendar.DATE, 60);
                endDate = calendar1.getTime();
                if (currentDate.after(endDate)) {
                    System.out.println(simpleDateFormat.format(startDate) + " " + simpleDateFormat.format(endDate));
                } else {
                    System.out.println(simpleDateFormat.format(startDate) + " " + simpleDateFormat.format(currentDate));
                }
            }
            i += 1;
        }
    }
}
