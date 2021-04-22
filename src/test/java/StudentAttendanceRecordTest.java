import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentAttendanceRecordTest {

    StudentAttendanceRecord studentAttendanceRecord = new StudentAttendanceRecord();

    @Test
    public void t1() {
        var input = "PPALLP";
        var expectedOutput = true;

        var actualOutput = studentAttendanceRecord.checkRecord(input);

        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void t2() {
        var input = "PPALLL";
        var expectedOutput = false;

        var actualOutput = studentAttendanceRecord.checkRecord(input);

        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void t3() {
        var input = "A";
        var expectedOutput = false;

        var actualOutput = studentAttendanceRecord.checkRecord(input);

        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void t4() {
        var input = "L";
        var expectedOutput = true;

        var actualOutput = studentAttendanceRecord.checkRecord(input);

        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void t5() {
        var input = "LL";
        var expectedOutput = true;

        var actualOutput = studentAttendanceRecord.checkRecord(input);

        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void t6() {
        var input = "LLL";
        var expectedOutput = false;

        var actualOutput = studentAttendanceRecord.checkRecord(input);

        assertEquals(actualOutput, expectedOutput);
    }

    @Test
    public void t7() {
        var input = "";
        var expectedOutput = false;

        var actualOutput = studentAttendanceRecord.checkRecord(input);

        assertEquals(actualOutput, expectedOutput);
    }

}