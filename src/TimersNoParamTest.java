import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TimersNoParamTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToString() {
		
		Timers obj =new Timers(9,15,30);
		
		String actual = obj.toString();
		
		String expected = "09:15:30";
		
		assertEquals(actual,expected);
		
		
	}

	@Test
	public void testTotal() {
		
		Timers obj =new Timers(9,15,30);
		
		int actual = obj.total();
		
		int expected = 33330;
		
		assertEquals(actual,expected);
		
	}

	@Test
	public void testAddSecond() {
		
		Timers obj =new Timers(9,15,30);
		
		obj.addSecond();
		
		int actual = obj.total();
		
		int expected = 33331;
		
		assertEquals(actual,expected);
		
	}

	@Test
	public void testSubtractSecond() {
		
       Timers obj =new Timers(9,15,30);
		
		obj.subtractSecond();
		
		int actual = obj.total();
		
		int expected = 33329;
		
		assertEquals(actual,expected);
		
		
		
	}

}
