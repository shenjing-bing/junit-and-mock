package org.xxx;

import junit.framework.TestCase;

import java.util.List;



// class must extend TestCase
public class AppTest extends TestCase {

    List<String> list;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.list = List.of("aaa", "bbb");
        System.out.println("<set up>");

    }
    // method name must start with 'test'
    public void testForJunit3() {
        //given
        final var java = "aaa";
        //when
        boolean aaa = list.contains(java);
        //then
        assertTrue(aaa);
    }
    public void test2ForJunit3() {

    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("<tear down>");
    }


}
