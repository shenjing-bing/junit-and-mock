package org.xxx;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.util.Enumeration;

/**
 * @author: shenjingbing
 **/
public class StandardForTestSuite{

    // method name must be 'suite'
    public static Test suite(){
        TestSuite allTests = new TestSuite("execution all tests");
        allTests.addTestSuite(AppTest.class);
        int i = allTests.countTestCases();
        return allTests;
    }
}