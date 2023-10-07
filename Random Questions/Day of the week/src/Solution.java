import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Calendar.MAY);
        System.out.println(dayOfTheWeek(7,10,2023));
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return dayNames[dayOfWeek - 1];
    }

}