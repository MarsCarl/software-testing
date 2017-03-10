package st1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsTriangle() {
		double test_a = 1;
		double test_b = 2;
		double test_c = 3;
		Triangle.isTriangle(test_a, test_b, test_c);
	}

	@Test
	public void testTriangleType() {
		double test_a = 2;
		double test_b = 2;
		double test_c = 3;
		Triangle.triangleType(test_a, test_b, test_c);
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}
