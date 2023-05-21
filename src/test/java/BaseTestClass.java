import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {

    @BeforeMethod
    public void beforeMethod (){
        System.out.println("Inside before method") ;

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
