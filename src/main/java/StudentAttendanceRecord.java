import java.util.HashMap;

public class StudentAttendanceRecord {
    public boolean checkRecord(String s) {
        var absences = 0;
        var threeConsecutiveLates = false;
        for (int i = 0; i <= s.length(); i++) {
            // Prevents indexOutOfBounds exception on last character
            var current = i == s.length()
                    ? s.substring(i)
                    : s.substring(i, i + 1);
            System.out.println(current);
            if (current.equals("A")) {
                absences++;
                if (absences == 2) {
                    break;
                }
            }
            else if (current.equals("L") && i >= 2) {
                var previous = s.substring(i - 1, i);
                var previousPrevious = s.substring(i - 2, i - 1);
                if (previous.equals("L") && previousPrevious.equals("L")) {
                    threeConsecutiveLates = true;
                    break;
                }
            }
        }
        if (threeConsecutiveLates) return false;
        else if (absences == 2) return false;
        else return true;
    }
}
