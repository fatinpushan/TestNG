import org.testng.Assert;
import org.testng.annotations.*;

public class TestClass extends BaseTestClass {





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













}
