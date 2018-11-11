package test.mvn.sp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import test.mvn.sp.dao.TestDAO;
import test.mvn.sp.dao.impl.TestDAOImpl;

/**
 * Unit test for simple App.
 */
public class AppTest{
	private TestDAO tdao = new TestDAOImpl();
	@Test
	public void test() {
		assertEquals(11, tdao.selectTestVOList(null).size());
		
	}
}
