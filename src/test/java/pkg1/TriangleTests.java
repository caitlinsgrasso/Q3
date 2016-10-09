package pkg1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTests {
	
	Triangle tri1 = new Triangle (3.0, 4.0, 5.0);
	Triangle tri2 = new Triangle (6.0, 8.0, 10.0);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getPerimeter1() {
		assertTrue(tri1.getPerimeter()==12.0);
		assertFalse(tri1.getPerimeter()==8.0);
	}
	
	@Test 
	public void getPerimeter2(){
		assertTrue(tri2.getPerimeter()==24.0);
		assertFalse(tri2.getPerimeter()==8.0);
	}

	@Test 
	public void getArea1() {
		assertTrue(tri1.getArea()==6.0);
		assertFalse(tri1.getArea()==5.0);
	}
	
	@Test 
	public void getArea2() {
		assertTrue(tri2.getArea()==24.0);
		assertFalse(tri2.getArea()==20.0);
	}
}
