package tests.step.definition;


public class hooks extends webdriverMethods{

@Before
public void setup() throws IOException{

driver = setBrowser();

}

@After("@lastScenario")
public void teardown(Scenario scenario){
driver.quit();
}

}

