package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dammy {
	
	@Test
	@Parameters({"URL"})
	public void test(String param)
	{
		System.out.println("test"+param);
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
		System.out.println("testing git");
	}
	@BeforeTest
	public void start()
	{
		System.out.println("Browser launch");
	}
	@AfterTest
	public void close()
	{
		System.out.println("Browser close");
	}
	@BeforeMethod
	public void method()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	public void methodl()
	{
		System.out.println("After method");
	}
	@BeforeClass
	public void Before()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void after()
	{
		System.out.println("After class");
	}
}
