package package1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TimeTableTest {
	@BeforeAll
	public static void init()
	{
		System.out.println("JUNIT5 Test starts.");
	}
	
	
	@AfterAll
	public static void stopTest()
	{
		System.out.println("JUNIT5 Test is over.");
	}
	
	
	@Test
	@DisplayName("北京时间是否正确")
	void testBeijing() {
		TimeTable hotel = new TimeTable();
        hotel.SetTimeTable(22,5,7);;
        assertEquals(10,hotel.BeijingShowhour(),"应该显示数字10");
	}
	
	@Test
	@DisplayName("伦敦时间是否正确")
	void testLondon() {
		TimeTable hotel = new TimeTable();
        hotel.SetTimeTable(22,5,7);;
        assertEquals(2,hotel.LondonShowhour(),"应该显示数字2");
	}
	
	@Test
	@DisplayName("莫斯科时间是否正确")
	void testMoscow() {
		TimeTable hotel = new TimeTable();
        hotel.SetTimeTable(22,5,7);;
        assertEquals(6,hotel.MoscowShowhour(),"应该显示数字6");
	}
	
	@Test
	@DisplayName("悉尼时间是否正确")
	void testSydney() {
		TimeTable hotel = new TimeTable();
        hotel.SetTimeTable(22,5,7);;
        assertEquals(0,hotel.SydneyShowhour(),"应该显示数字0");
	}
	
	@Test
	@DisplayName("纽约时间是否正确")
	void testNewYork() {
		TimeTable hotel = new TimeTable();
        hotel.SetTimeTable(22,5,7);;
        assertEquals(9,hotel.NewYorkShowhour(),"应该显示数字9");
	}
	
	

}
