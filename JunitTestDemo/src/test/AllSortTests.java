package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

import utils.SelectionSortUtils;

class AllSortTests {
	private final int N=10;
	private int[] values = new int[N];

	@BeforeEach
	void setUp(RepetitionInfo info) throws Exception {
		System.out.println("Test #"+info.getCurrentRepetition());
		var r = new Random(System.nanoTime());
		for(int i=0;i<N;++i) {
			values[i] = r.nextInt(100);
		}
	}

	@RepeatedTest(value=40,name="#{displayName} {currentRepetition} of {totalRepetitions}")
	@DisplayName("should sort values")
	void testSelectionSort1() {
		System.out.println(Arrays.toString(values));
		
		var sorted = SelectionSortUtils.doSort(values);
		Arrays.sort(values);
		
		System.out.println(Arrays.toString(sorted));
		
		assertEquals(sorted, values);
	}

}
