package core;

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
	public void Test01_AssertEquals_Pos() {
		System.out.println("Test01_AssertEquals_Pos");

	}

	@Test
	public void Test02_AssertEquals_Neg() {
		System.out.println("Test02_AssertEquals_Neg");

	}

	@Ignore
	@Test
	public void Test_03_AssertEquals_Ignored() {
		System.out.println("Test_03_AssertEquals_Ignored");

	}

	@Test
	public void Test04_AssertSame_Pos() {
		System.out.println("Test04_AssertSame_Pos");

	}

	@Test
	public void Test05_AssertSame_Neg() {
		System.out.println("Test05_AssertSame_Neg");

	}

	@Ignore
	@Test
	public void Test06_AssertSame_Ign() {
		System.out.println("Test06_AssertSame_Ign");

	}

	@Test
	public void Test07_AssertFalse_Pos() {
		System.out.println("Test07_AssertFalse_Pos");

	}

	@Test
	public void Test08_AssertFalse_Neg() {
		System.out.println("Test08_AssertFalse_Neg");

	}

	@Test
	public void Test09_AssertTrue_Pos() {
		System.out.println("Test09_AssertTrue_Pos");

	}

	@Test
	public void Test10_AssertTrue_Neg() {
		System.out.println("Test10_AssertTrue_Neg");

	}

}