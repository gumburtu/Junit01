import org.junit.*;

public class Test02 {
    @BeforeClass
    public static void beforeMyClass(){
        System.out.println("Before Test");
    }
    @Before
    public void beforeMyTests(){
        System.out.println("Before Test");
    }
    @Test
    public void myTest1() {
        System.out.println("MyTest 1");
    }
    @Test
    public void myTest2() {
        System.out.println("MyTest 2");
    }
    @Test
    public void myTest3() {
        System.out.println("MyTest 3");
    }
    @After
    public void afterMyTests(){
        System.out.println("After Test");
    }
    @AfterClass
    public static void afterMyClass(){
        System.out.println("After Test");
    }
}
