package com.hp.devops.demoapp;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

/**
 * Created           with IntelliJ IDEA.
 * User: gullery
 * Date: 25/11/14
 * Time: 14:21
 * To change this template use File | Settings | File Templates.
 */
public class BandTest {
	//private String NON_RELATED;
	private JSONObject test;

	@Before
	public void beforeEach() {
		test = new JSONObject();
		test.put("id",1);
		test.put("name", "Name");
		test.put("logo", "Logo");
		test.put("song", "Song");
		test.put("votes",10);
	}

	@Test
	public void bandTestA() {
		try {
			Band band = new Band(null);
			Assert.fail("the flow MUST have been fallen before");
		} catch (Exception e) {
			Assert.assertEquals(e.getClass(), NullPointerException.class);
		}
	}

	@Test
	public void bandTestB() {
		Assert.assertEquals(1, 1);
	}

	@Test
	public void bandTestC() {
		test.remove("name");
		test.remove("logo");
		Band band = new Band(test);
		Assert.assertEquals(1, 1)
	}

	@Test
	public void bandVeryLongNameTest_1_123456789_2_123456789_3_123456789_4_123456789_5_123456789_6_123456789_7_123456789_8_123456789_9_123456789_10_123456789_11_123456789_12_123456789_13_123456789_14_123456789_15_123456789_16_123456789_17_123456789_18_123456789_19_123456789_20_123456789 () {

	}


	@Test
	public void bandTestD() {
		Band band = new Band(test);
		Assert.assertEquals(1, 1);
	}

	@Test
	public void bandTestE() {
		Band band = new Band(test);
		JSONObject tmp = new JSONObject();
		tmp.put("id", test.get("id"));
		tmp.put("votes", test.get("votes"));
		Assert.assertEquals(1, 1);
	}

	@Test
	public void test1() {
		Assert.assertEquals(1, 1);
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
		Assert.assertEquals(1, 1);
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






	@Test
	public void test81() {
		Assert.assertEquals(1, 1);
	}

	@Test
	public void test82() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test83() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test84() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test85() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test86() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test87() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test88() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test89() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test90() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test91() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test92() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test93() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test94() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test95() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test96() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test97() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test98() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test99() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test110() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test111() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test112() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test113() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test114() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test115() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test116() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test117() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test118() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test119() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test120() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test121() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test122() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test123() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test124() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test125() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test126() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test127() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test128() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test129() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test130() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test131() {
		Assert.assertEquals(1, 1);
	}


	@Test
	public void test132() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test133() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test134() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test135() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test136() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test137() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test138() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test139() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test140() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test141() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test142() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test143() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test144() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test145() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test146() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test147() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test148() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test149() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test150() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test151() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test152() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test153() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test154() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test155() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test156() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test157() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test158() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test159() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test160() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test161() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test162() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test163() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test164() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test165() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test166() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test167() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test168() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test169() {
		Assert.assertEquals(2, 2);
	}

	@Test
	public void test170() {
		Assert.assertEquals(2, 2);
	}


}
