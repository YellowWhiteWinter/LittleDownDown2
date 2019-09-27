package package1;
import java.util.*;

public class Time {
	int hour = 0;
	int minute = 0;
	int second = 0;
	int showhour = 0;
	
	public Time() {};
	
	
	public void SetTime(int h, int m, int s)
	{
		hour = h;
		minute = m;
		second = s;
		
		if(hour>=24)
			hour = hour-24;
		
		if(hour<0)
			hour = 24+hour;
		
		if(hour > 12)
			showhour = hour - 12;
		else
			showhour = hour;
	}
	
	
	
	public void ShowTime()
	{
		System.out.println(showhour + ":" + minute + ":" + second);
	}
	
}
