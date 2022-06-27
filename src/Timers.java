
public class Timers {

	// Class Variable to hold the number of units, tens, hundreds
		private int hours;
		private int minutes;
		private int seconds;
		
		
		// Construct with no parameters --- set all variables to 0
		public Timers()
		{
			hours=0;
			minutes=0;
			seconds=0;
		}
		
		// Construct with parameters --- set all variables to their respective parameter values		
		public Timers(int h, int m, int s)
		{
			hours=h;
			minutes=m;
			seconds=s;
		}
		
		// Convert the value to a string representation
		public String toString()
		{
			
			String out = String.format("%02d", hours)+":"+String.format("%02d",minutes)+":"+String.format("%02d", seconds);
			
			System.out.println(out);
			
			return out;
		}
    
        // Convert the value to a string representation
        public int total()
        {
            int total = hours*60*60 +minutes*60 +seconds;
            
            return total;
        }
		
		// Increment the value by 1 unit
		
		public void addSecond()
		{
			// Increment seconds
			seconds++;
			
			// If seconds is gone past 60 then add one to minutes and reset seconds to 0
			if(seconds>=60)
			{
				seconds=0;
				minutes++;
			}
				
			// If minutes is gone past 60 then add one to hours and reset minutes to 0
			if(minutes>=60)
			{
				minutes=0;
				hours++;
			}
			
			// If hours is gone past 23 then reset hours to 0
			if(hours==24)
			{
				hours=0;
			}
			
		}
		
		public void subtractSecond()
		{
			
			// Increment seconds
			seconds--;
			
			// If seconds is gone past 0 then subtract one to minutes and reset seconds to 59
			if(seconds<=-1)
			{
				seconds=59;
				minutes--;
			}
			
			// If minutes is gone past 0 then subtract one from the hours and reset minutes to 59
			if(minutes<=-1)
			{
				minutes=59;
				hours--;
			}
				
			// If hours is gone past 0 then reset hours to 23
			if(hours<=-1)
			{
				hours=23;
			}
			
		}
		
}
