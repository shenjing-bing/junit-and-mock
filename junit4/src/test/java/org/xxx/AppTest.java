package org.xxx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static List<String> testClassList;
    private List<String> testCaseList;

    @BeforeClass
    public static void beforeClass() {
        testClassList = new ArrayList<>();
    }
    @Before
    public void before() {
        testCaseList = new ArrayList<>();
    }

    @Test
    public void testAdd1ElementTwoList() {
        assertTrue(testClassList.add("java"));
        assertTrue(testCaseList.add("java"));
    }

    @Test
    public void testAdd2ElementTwoList() {
        assertTrue(testClassList.add("java"));
        assertTrue(testCaseList.add("java"));
    }
    @Ignore
    @Test
    public void testAdd3ElementTwoList() {

    }

    @After
    public void after() {
        assertEquals(1,testCaseList.size());
        testCaseList.clear();
    }

    @AfterClass
    public static void afterClass() {
        assertEquals(2,testClassList.size());
        testClassList.clear();
    }

}
