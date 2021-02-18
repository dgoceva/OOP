package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import utils.ColorUtils;

class AllColorTests {

	private ColorUtils colors;
	
	@BeforeEach
	void setUp() throws Exception {
		colors = new ColorUtils();
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		colors.add("blue");
		colors.add("magenta");
		colors.add("brown");
	}

	@Test
	@DisplayName("added new color")
	void add() {
		colors.add("pink");
		assertTrue(colors.contains("pink"));
	}

	@Test
	@DisplayName("removed color")
	void remove() {
		var color = "green";
		colors.remove(color);
		assertFalse(colors.contains(color), "failure - color still in bag");
	}
	
	@Test
	@DisplayName("list trasnsformation")
	void toList() {
		var myList = Arrays.asList("red","green","yellow","blue","magenta","brown");
		var colorList = colors.toList();
		
		Collections.sort(myList);
		Collections.sort(colorList);
		assertEquals(myList, colorList, "failure - transformation doesn't work");
	}
	
	@Test
	@DisplayName("size of colors collection")
	void size() {
		assertEquals(6, colors.size(),"failure - size does not match");
	}
}
