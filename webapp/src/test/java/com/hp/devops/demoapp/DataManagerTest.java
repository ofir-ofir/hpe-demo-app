package com.hp.devops.demoapp;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.security.InvalidParameterException;

/**
 * Created with IntelliJ IDEA.
 * User:  gullery
 * Date: 25/11/15
 * Time: 14:48
 * To change this template use File  | Settings | File Templates.
 */
public class DataManagerTest {

	@Ignore
	@Test
	public void dataManagerTestA() {
		try {
			DataManager.init(null);
			Assert.fail("the flow MUST have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(e.getClass(), InvalidParameterException.class);
			Assert.assertEquals(e.getMessage(), "servletContext must not be null");
		}
	}

	@Ignore
	@Test
	public void dataManagerTestB() {
		DataManager.loadData();
		Assert.assertEquals(DataManager.isInitialized(), false);
	}

	@Ignore
	@Test
	public void failTestForCoverageAnalysisB() {
		DataManager.loadData();
		Assert.assertEquals(true, true);
	}

	@Ignore
	@Test
	public void dataManagerTestC() {
		try {
			DataManager.getAll();
			Assert.fail("the flow MUST have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(e.getClass(), Exception.class);
			Assert.assertEquals(e.getMessage(), "service not initialized");
		}
	}

	@Ignore
	@Test
	public void dataManagerTestD() {
		try {
			DataManager.getBand(0);
			Assert.fail("the flow MUST have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(e.getClass(), Exception.class);
			Assert.assertEquals(e.getMessage(), "service not initialized");
		}
	}

	@Ignore
	@Test
	public void dataManagerTestE() {
		try {
			DataManager.upVoteBand(0);
			Assert.fail("the flow MUST have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(e.getClass(), Exception.class);
			Assert.assertEquals(e.getMessage(), "service not initialized");
		}
	}


	@Test
	public void test1() {
		Assert.assertEquals(1, 2);
	}


	@Test
	public void test2() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test3() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test4() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test5() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test6() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test7() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test8() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test9() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test10() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test11() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test12() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test13() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test14() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test15() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test16() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test17() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test18() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test19() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test20() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test21() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test22() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test23() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test24() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test25() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test26() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test27() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test28() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test29() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test30() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test31() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test32() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test33() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test34() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test235() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test236() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test37() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test38() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test39() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test40() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test41() {
		Assert.assertEquals(1, 2);
	}


	@Test
	public void test42() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test43() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test44() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test45() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test46() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test47() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test48() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test49() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test50() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test51() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test52() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test53() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test54() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test55() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test56() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test57() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test58() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test59() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test60() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test61() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test62() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test63() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test64() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test65() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test66() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test67() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test68() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test69() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test70() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test71() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test72() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test73() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test74() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test75() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test76() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test77() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test78() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test79() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test80() {
		Assert.assertEquals(2, 2);
	}
}
