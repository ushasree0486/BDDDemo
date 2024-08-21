package api.cucumber.hook;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class CucumberHooks {
    @Before(order=-3)
    public void setUp(){

        System.out.println("---Before hook---");
    }
    @Before(order=1)
    public void setUp1(){

        System.out.println("---Before hook---");
    }

    @After
    public void tearDown(){
        System.out.println("---After hook---");
    }

    @BeforeStep
    public void setSetUp(){
        System.out.println("----BeforeStep hook----");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("----AfterStep hook----");
    }
}
