package practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dammy1 {
	
	@Test
	//@Parameters({"URL"})
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	@Test
	public void test4()
	{
		System.out.println("test4");
	}
	@Test
	public void sa()
	{
		System.out.println("sample");
	}
	@BeforeSuite
	public void sap()
	{
		System.out.println("url launch");
	}
	@AfterSuite
	public void sapp()
	{
		System.out.println("at last");
	}
}
