package com.hp.devops.demoapp.tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 03/12/15
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 * THIS IS XANDER
 */
public class TestSuiteA_TestNG_Selenium {

    TestData data;

    private void setUp() {
        data = TestData.generate();
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        setUp();
    }

    @Test(groups = {"Group_A"})
    public void testCase1() {
        System.out.println("Proudly running test " + Thread.currentThread().getStackTrace()[1]);
        WebElement query;
        if (data.isMusicApp()) {
            query = data.getDriver().findElement(By.id("bandsList"));
            Assert.assertEquals(query.getTagName(), "div");
        } else {
            query = data.getDriver().findElement(By.id("jenkins"));
            Assert.assertEquals(query.getTagName(), "body");
        }
        Assert.assertEquals(query.isDisplayed(), true);
    }

    @Test
    public void testCase2() {
        System.out.println("Proudly running test " + Thread.currentThread().getStackTrace()[1]);
        WebElement query;
        if (data.isMusicApp()) {
            query = data.getDriver().findElement(By.id("totalVotes"));
            Assert.assertEquals(query.getTagName(), "div");
        } else {
            query = data.getDriver().findElement(By.id("jenkins"));
            Assert.assertEquals(query.getTagName(), "body");
        }
        Assert.assertEquals(query.isDisplayed(), true);
    }

    @Test(groups = {"Group_A"})
    public void testCase3() {
        System.out.println("Proudly  running  test " + Thread.currentThread().getStackTrace()[1]);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = {"Group_A"})
    public void test1() {
        Assert.assertEquals(1, 2);
    }


    @Test(groups = {"Group_A"})
    public void test2() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test3() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test4() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test5() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test6() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test7() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test8() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test9() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test10() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test11() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test12() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test13() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test14() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test15() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test16() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test17() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test18() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test19() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test20() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test21() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test22() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test23() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test24() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test25() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test26() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test27() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test28() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test29() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test30() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test31() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test32() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test33() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test34() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test235() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test236() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test37() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test38() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test39() {
        Assert.assertEquals(2, 2);
    }

    @Test(groups = {"Group_A"})
    public void test40() {
        Assert.assertEquals(2, 2);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        data.getDriver().quit();
    }
}