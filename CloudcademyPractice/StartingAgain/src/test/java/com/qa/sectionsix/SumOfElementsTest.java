package com.qa.sectionsix;

import com.qa.cloudacademy.sectionsix.SumOfElements;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SumOfElementsTest {
	private SumOfElements soe;
	
	@Before
	public void setup() {
		soe = new SumOfElements();
	}
	@Test
	public void testListSizeEqualsFive() {
		List<Integer> checkSize = soe.createAndFillList(5);
		assertEquals(5, checkSize.size());
	}
	
	@Test
	public void testSumEqualsTwenty() {
		List<Integer> checkSum = new ArrayList<>();
		checkSum.add(5);
		checkSum.add(5);
		checkSum.add(5);
		checkSum.add(5);
		assertEquals(20, soe.sumElements(checkSum));
	}
}
