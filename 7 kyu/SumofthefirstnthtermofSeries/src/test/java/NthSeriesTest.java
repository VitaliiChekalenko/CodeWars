import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


public class NthSeriesTest {

	@Test
	public void test1() {
		assertEquals(NthSeries.seriesSum(5), "1.57");
	}
	@Test
	public void test2() {
		assertEquals(NthSeries.seriesSum(9), "1.77");
	}
	@Test
	public void test3() {
		assertEquals(NthSeries.seriesSum(15), "1.94");
	}
	@Test
	public void test5() {
		assertEquals(NthSeries.seriesSum(2), "1.25");
	}
	@Test
	public void test4() {
		assertEquals(NthSeries.seriesSum(96), "1.94");
	}
}
