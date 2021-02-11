package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import utils.StringUtils;

class AllStringTests {

	@ParameterizedTest
	@ValueSource(strings= {"racecar","radar","level","abba","refer","face"})
	void testPalindrome(String word) {
		assertTrue(StringUtils.isPalindrome(word));
	}

}
