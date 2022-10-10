## junit3

### 基本使用

#### Maven依赖

```xml
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>3.8.2</version>
            <scope>test</scope>
```

#### TestCase

1. 类必须要继承TestCase
2. 测试方法必须要以test开头

```java
// class must extend TestCase
public class AppTest extends TestCase {

    List<String> list;

    @Override
    protected void setUp() throws Exception {
        this.list = List.of("aa", "bbb");
        System.out.println("<set up>");

    }
    // method name must start with 'test'
    public void testForJunit3() {
        //given
        final var java = "aa";
        //when
        boolean aaa = list.contains(java);
        //then
        assertTrue(aaa);
    }
    public void test2ForJunit3() {

    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("<tear down>");
    }


}
```

#### TestSuite

1. 方法名必须叫suite
   ```java
   public class StandardForTestSuite{

       // method name must be 'suite'
       public static Test suite(){
           TestSuite allTests = new TestSuite("execution all tests");
           allTests.addTestSuite(AppTest.class);
           return allTests;
       }
   }
   ```

### 架构梳理与设计模式
