package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import utils.MathUtils;

class AllMathTests {
	private static List<Integer> value;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		value = List.of(1,2,-3,4,-5);
	}

	@Test
	void test() {
//		fail("Not yet implemented");
	}

	@Test
	void testSum1() {
		assertEquals(-1, MathUtils.sum(value));
	}
	
	@Test
	void testSum2() {
		assertEquals(0, MathUtils.sum(null));
	}
	
	@Test
	@DisplayName("test get possitive values")
	void testPossitive1() {
		assertEquals(MathUtils.possitive(value), List.of(1,2,4));
	}
}
