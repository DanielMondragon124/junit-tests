import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setup() {
        student = new Student(1, "John Doe");
    }

    @Test
    public void testGetId() {
        assertEquals(1, student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testAddGradeAndGetGrades() {
        student.addGrade(80);
        student.addGrade(90);
        student.addGrade(75);

        ArrayList<Integer> expectedGrades = new ArrayList<>();
        expectedGrades.add(80);
        expectedGrades.add(90);
        expectedGrades.add(75);

        assertEquals(expectedGrades, student.getGrades());
    }

    @Test
    public void testGetGradeAverage() {
        student.addGrade(80);
        student.addGrade(90);
        student.addGrade(75);

        double expectedAverage = (80 + 90 + 75) / 3.0;
        assertEquals(expectedAverage, student.getGradeAverage(), 0.0001);
    }

    @Test
    public void testGetGradeAverageWithNoGrades() {
        assertEquals(0.0, student.getGradeAverage(), 0.0001);
    }
}
