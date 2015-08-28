package core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass method will be executed once before first test method starts");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass method will be executed once after last test method starts");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before method will be executed before each test method starts");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After method will be executed after each test method starts");
	}

	@Test
	public void Test01_AssertEquals_Pos(){
		assertEquals("String not the same","Hello Alex!",App.s);
		System.out.println("Test01_AssertEquals_Pos");
	}
	@Test
	public void Test02_AssertEquals_Neg(){
		assertEquals("String not the same","Hello World!",App.s);
		System.out.println("Test02_AssertEquals_Neg");
	}
	@Ignore
	@Test
	public void Test03_AssertEguals_Ign(){
		assertEquals("String not the same","Hello Mr.Khatilov!",App.s);
		System.out.println("Test03_AssertEquals_Ign");
	}
	@Test
	public void Test04_AssertSame_Pos(){
		assertSame("Integer not the same",-128,App.iw);
		System.out.println("Test04_AssertSame_Pos");
	}
	@Test
	public void Test05_AssertSame_Neg(){
		assertSame("Integer not the same",129,App.iw);
		System.out.println("Test05_AssertSame_Neg");
	}
	@Ignore
	@Test
	public void Test06_AssertSame_Ign(){
		assertSame("Integer not the same",-1234567890,App.iw);
		System.out.println("Test06_AssertSame_Ign");
	}
	@Test
	public void Test07_AssertFalse_Pos(){
		assertFalse("Boolean should be false",App.fw);
		System.out.println("Test07_AssertFalse_Pos");
	}
	@Test
	public void Test08_AssertFalse_Neg(){
		assertFalse("Boolean should be false",App.tw);
		System.out.print("Test08_AssertTrue_Neg");
	}
	@Test
	public void Test09_AssertTrue_Pos(){
		assertTrue("Boolean should be true",App.tw);
		System.out.println("Test09_AssertTrue_Pos)");
	}
	@Test
	public void Test10_AssertTrue_Neg(){
		assertTrue("Boolean should be true",App.fw);
		System.out.print("Test10_AssertTrue_Neg");
	}
	}
