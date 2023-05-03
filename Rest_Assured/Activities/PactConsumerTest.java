package Activities;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@ExtendWith(PactConsumerTestExt.class)
public class PactConsumerTest {
    // Headers
    Map<String, String> headers = new HashMap<String, String>();
    // Resource Path
    String createUser = "/api/users";

    // Create the contract
    @Pact(consumer = "UserConsumer", provider = "UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder) {
        // Set the headers
        headers.put("Content-Type", "application/json");
        headers.put("Accept", "application/json");
        // Create the request and response body
        DslPart bodySentCreateUser = new PactDslJsonBody()
                .numberType("id", 12345)
            .stringType("firstName", "Nagendrabala")
            .stringType("lastName", "mamillapalli")
            .stringType("email", "nmamilla@example.com");
        // Create response JSON
        DslPart bodyReceivedCreateUser = new PactDslJsonBody()
                .numberType("id", 12345)
                .stringType("firstName", "Nagendrabala")
                .stringType("lastName", "mamillapalli")
                .stringType("email", "nmamilla@example.com");

        // Create the contract
        return builder.given("create user request").
            uponReceiving("A request to create a user").
                method("POST").
                path(createUser).
                headers(headers).
                body(bodySentCreateUser).
            willRespondWith().
                status(201).
                body(bodyReceivedCreateUser).
            toPact();
    }

    // Consumer side test
    @Test
    @PactTestFor(providerName = "UserProvider", port = "8080")
    public void runTest() {
        // Request Body
        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("id", 1234);
        reqBody.put("firstName", "Nagendrabala");
        reqBody.put("lastName", "mamillapalli");
        reqBody.put("email", "nmamilla@in.ibm.com");

        // Send post request
        given().baseUri("http://localhost:8080").headers(headers).body(reqBody).
        when().post(createUser).
        then().statusCode(201);
    }
}