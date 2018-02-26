package tests.step.serviceStepDefinition;

public class serviceFunctions extends commonServiceFunctions{

Response rs;

RequestSpecification spec = given().auth().preemptive().oauth2(getToken()).contentType(ContentType.JSON);

@Given("XXXXXXXXXXXXXXXXXXXXXXX")
public void someFunctionName() throws Throwable{

rs= spec.get("api end point");
}

@Then("XXXXXXXXXXXXXXXXX")
public void someValidationFunctionName(int statusCode) throws Throwable{

Assert.assertEquals(rs.getStatusCode(), statusCode);
}

}
