import java.util.*;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
        int d = cal.get(Calendar.DAY_OF_WEEK);
        String[] days={"Sunday", "Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday"};
        return days[d-1];
    }
}
