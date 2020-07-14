import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class EmployerTest {

	private Employer employer;

	@Test
	void testEmployerFirstName() {
		employer = new Employer("John");
		assertThat(employer.gerFirstName(), is("John"));
	}

}
