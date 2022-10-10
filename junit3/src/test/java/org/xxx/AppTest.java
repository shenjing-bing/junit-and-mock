package org.xxx;

import junit.framework.TestCase;

import java.util.List;



// class must extend TestCase
public class AppTest extends TestCase {

    List<String> list;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.list = List.of("aa", "bb");
        System.out.println("<set up>");

    }
    // method name must start with 'test'
    public void testForJunit3() {
        //Arrange
        final var java = "aa";
        //act
        boolean aaa = list.contains(java);
        //assert
        assertTrue(aaa);
    }
    public void test2ForJunit3() {
        //Arrange
        final var java = "bb";
        //act
        boolean bb = list.contains(java);
        //assert
        assertTrue(bb);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("<tear down>");
    }


}
