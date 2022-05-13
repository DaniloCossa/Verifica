import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CossaDaniloTest_B {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		f = new CossaDaniloClass();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testProdottoZero() {
		CossaDaniloClass f = new CossaDaniloClass();
		int risAtteso = 5;
		int risOttenuto = f.cossaMet(210); 
		System.out.println(risOttenuto);
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	public void testProdottoUno() {
		CossaDaniloClass f = new CossaDaniloClass();
		int risAtteso = 6;
		int risOttenuto = f.cossaMet(210); 
		//System.out.println(risOttenuto);
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	public void testProdottoDue() {
		CossaDaniloClass f = new CossaDaniloClass();
		int risAtteso = 7;
		int risOttenuto = f.cossaMet(210); 
		System.out.println(risOttenuto);
		assertEquals(risAtteso, risOttenuto);
	}

	/*@Test
	public void test() {
		fail("Non ancora implementato");
	}*/

}