package io.quarkiverse.quarkus.echo.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class EchoResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/echo")
                .then()
                .statusCode(200)
                .body(is("Hello echo"));
    }
}
