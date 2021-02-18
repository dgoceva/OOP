package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.TestClass;

class TestCount {

	@Test
	void test() {
//		fail("Not yet implemented");
		TestClass obj = new TestClass();
		assertEquals(2, obj.countChar("java", 'a'));
	}
	@Test
	void testNoCase() {
		TestClass obj = new TestClass();
		assertEquals(2, obj.countNoCaseChar("java", 'A'));
	}
}
