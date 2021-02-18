package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import code.TestClass;

class TestSquare {

	@Test
	void test() {
//		fail("Not yet implemented");
		TestClass obj = new TestClass();
		assertEquals(25,obj.square(5));
	}

}
