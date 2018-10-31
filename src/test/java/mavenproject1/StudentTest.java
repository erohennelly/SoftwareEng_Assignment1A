package mavenproject1;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;

import SoftEng.Assignment1.mavenproject1.Student;

//@Eoghan Hennelly

public class StudentTest {

	@Test
	public void testUsername() throws ParseException {
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

		String name = "Johnny Buzz";
		int age = 22;
		Date dob = dateformat.parse("26/06/1997");
		int id = 5656;
		
		Student testStudent = new Student(name, dob, id);
		
		String expected = name + age + id;
		String actual = testStudent.getUsername();
		
		System.out.println("actual:\n\t" + actual + "\nexpected:\n\t" + expected);
		assertEquals(expected, actual);
	}

}
