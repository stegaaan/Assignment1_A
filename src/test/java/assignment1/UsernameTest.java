package assignment1;

import static org.junit.Assert.*;

public class UsernameTest {

	@org.junit.Test
	public void Usernametest() {
		Student example = new Student("JohnDoe","20","21-12-1995",13456789);

        String result = example.getUsername();

        assertEquals("JohnDoe20", result);
	}

}
