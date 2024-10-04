package ch.heigvd.amt;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ProbeResourceTest {
    @Test
    void testMainEndpoint() {
        given()
          .when().get("/")
          .then()
             .statusCode(200)
             .body(containsString("Welcome to Uptime"));
    }

}