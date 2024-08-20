package api.cucumber.hook;

import org.junit.After;
import org.junit.Before;

public class CucumberHooks {
    @Before
    public void setUp(){

        System.out.println("---Before hook---");
    }
    @After
    public void tearDown(){
        System.out.println("---After hook---");
    }
}
