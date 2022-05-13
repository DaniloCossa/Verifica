import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CossaDaniloTest_A {
	
	@Test
	public void testProdottoZero() {
		CossaDaniloClass f = new CossaDaniloClass();
		int risAtteso = 7;
		int risOttenuto = f.cossaMet(5); 
		System.out.println(risOttenuto);
		assertEquals(risAtteso, risOttenuto);
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

	/**@Test
	public void test() {
		fail("Non ancora implementato");
	}*/
	
	public int cossaMet(int s, int f) {
		int r = 0;
		for(int i=0;i<=f;i++) {
			r+=i;
		}
		return r;
	}

}
