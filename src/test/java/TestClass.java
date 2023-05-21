import org.testng.Assert;
import org.testng.annotations.*;

public class TestClass {

    @BeforeMethod
    public void beforeMethod (){
        System.out.println("Inside before method") ;

    }



    @Test

    public void firstTest(){
        System.out.println("Inside firstTest");
        AddClass addclass = new AddClass() ;

        int res = addclass.num(2,3) ;
        Assert.assertEquals(5,res);


    }





    @Test
    public void test2(){
        System.out.println("This is second test");
    }



    @AfterMethod
    public void afterMethod (){
        System.out.println("After method") ;
        System.out.println("");
    }



    @BeforeClass
    public void before() {
        System.out.println("Before class");
        System.out.println();
    }


    @AfterClass
    public void afterclass(){
        System.out.println("After class");
    }







}
