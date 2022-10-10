package org.xxx;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author: shenjingbing
 **/
public class StandardForTestSuite{

    public static Test suite(){
        TestSuite allTests = new TestSuite("execution all tests");
        allTests.addTestSuite(AppTest.class);
        return allTests;
    }
}