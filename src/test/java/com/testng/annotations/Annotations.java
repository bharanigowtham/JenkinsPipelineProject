package com.testng.annotations;

import org.testng.annotations.*;


public class Annotations {
	
	@BeforeSuite
	public void prepareEnvironment() {
		System.out.println("BEFORE SUITE --> Preparing the test environment...");
	}
	
	@AfterSuite() 
	public void prepareReports() {
		System.out.println("AFTER SUITE -->Reports generation...");
	}
	
	@BeforeTest
	public void initializeDriver() {
		System.out.println("BEFORE TEST -->Driver initializing....");

	}
	
	@AfterTest
	public void closeDriver() {
		System.out.println("AFTER TEST -->Closing the driver...");

	}
	
	@BeforeClass
	public void AppLaunch() {
		System.out.println("BEFORE CLASS -->Launching the application....");

	}
	
	@AfterClass 
	public void closetheappBrowser() {
		System.out.println("AFTER CLASS -->Close the current browser....");

	}
	
	@BeforeMethod
	public void doLogin() {
		System.out.println("BEFORE METHOD -->Entering username & password to login...");

	}
	
	@AfterMethod
	public void doLogout() {
		System.out.println("AFTER METHOD -->Logging out from app....");

	}
	
	@Test
	public void executingtheTestcase1() {
		System.out.println("TESTCASE1 -->Test case 1 executing.....");

	}
	
	@Test
	public void executingtheTestcase2() {
		System.out.println("TESTCASE2 --> Test case 2 executing.....");

	}
	
	
}
