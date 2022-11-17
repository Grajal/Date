package es.unileon.prg1.date;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DateTest {

	private Date today;
	
	@Before
	public void setUp() throws Exception {
		today=new Date(16, 13, 2022);
	}

	@Test
	public void testDate() {
		assertEquals("17/11/2022", today.toString());
	}

	@Test
	public void testGetDay() {
		assertEquals(16, today.getDay());
	}

	@Test
	public void testGetMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDay() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMonth() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDaysSinceStartYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDaysOfMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRandomDateInsideYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNumAttemptsToday_while() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNumAttemptsToday_dowhile() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSameYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSameMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSameDay() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSame() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNameMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSeason() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDatesUntilEndOfMonth() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSameMonthsDaysAsDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMonthsUntilYearEnds() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsValid() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testCumpleSamu() {
		fail("Not yet implemented");
	}

}
