package package1;
import java.io.IOException;
import java.util.*;

public class TimeTable {
	Time Beijing = new Time();
	Time London = new Time();
	Time Moscow = new Time();
	Time Sydney = new Time();
	Time NewYork = new Time();
	
	public TimeTable()
	{		
	}
     
	public void SetTimeTable(int a,int b,int c)
	{
		Beijing.SetTime(a,b,c);
		London.SetTime(a-8,b,c);
		Moscow.SetTime(a-4,b,c);
		Sydney.SetTime(a+2,b,c);
		NewYork.SetTime(a-13,b,c);
	}
	
	public int BeijingShowhour()
	{
		return Beijing.showhour;
	}
	
	public int LondonShowhour()
	{
		return London.showhour;
	}
	
	public int MoscowShowhour()
	{
		return Moscow.showhour;
	}
	
	public int SydneyShowhour()
	{
		return Sydney.showhour;
	}
	
	public int NewYorkShowhour()
	{
		return NewYork.showhour;
	}
	
	
	public void showTimeTable()
	{
		System.out.print("Beijing--");
		Beijing.ShowTime();
		
		System.out.print("London--");
		London.ShowTime();
		
		System.out.print("Moscow--");
		Moscow.ShowTime();
		
		System.out.print("Sydney--");
		Sydney.ShowTime();
		
		System.out.print("NewYork--");
		NewYork.ShowTime();
	}
	
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("请输入,空格隔开，然后回车");
        int a,b,c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        TimeTable hotel = new TimeTable();
        hotel.SetTimeTable(a, b, c);;
        hotel.showTimeTable();      
	}
	
}
