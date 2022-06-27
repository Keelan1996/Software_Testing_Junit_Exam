import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



//Step 1
@RunWith(Parameterized.class)

public class TimersParamTest {
	
	//Step 2
    int hour;
    int min;
    int sec;
    int testTotalExpected;
    int addSecExpected;
    int subSecExpected;
	
	// step 3
	public TimersParamTest(int hour, int min, int sec, int testTotalExpected, int addSecExpected, int subSecExpected) {
		super();
		this.hour = hour;
		this.min =min;
		this.sec=sec;
		this.testTotalExpected = testTotalExpected;
		this.addSecExpected = addSecExpected;
		this.subSecExpected= subSecExpected;
		
	}
	
	// step 4
	@Parameters
	public static Collection<Object[]> getData()
	{
		Object [][] data = new Object[3][6];
		
		data[0][0]= 9;
		data[0][1]= 15;
		data[0][2]= 30;
		data[0][3]= 33330;
		data[0][4]= 33331;
		data[0][5]= 33329;
		
		
		data[1][0]= 0;
		data[1][1]= 0;
		data[1][2]= 0;
		data[1][3]= 0;
		data[1][4]= 1;
		data[1][5]= 86399;
		
		data[2][0]= 23;
		data[2][1]= 59;
		data[2][2]= 59;
		data[2][3]= 86399;
		data[2][4]= 0;
		data[2][5]= 86398;
		
		
		return Arrays.asList(data); 
	}


	

	@Test
	public void testTotal() {
        
		Timers obj =new Timers(this.hour,this.min,this.sec);
		
		int actual = obj.total();
		
		int expected = this.testTotalExpected;
		
		assertEquals(actual,expected);
		
	}

	@Test
	public void testAddSecond() {
		
		Timers obj =new Timers(this.hour,this.min,this.sec);
		
		obj.addSecond();
		
		int actual = obj.total();
		
		int expected = this.addSecExpected;
		
		assertEquals(actual,expected);
		
	}

	@Test
	public void testSubtractSecond() {
		
		Timers obj =new Timers(this.hour,this.min,this.sec);
		
		obj.subtractSecond();
		
		int actual = obj.total();
		
		int expected = this.subSecExpected;
		
		assertEquals(actual,expected);
		
	}

}
