package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;

@QuarkusTest
public class MenuResourceTest {

    @Test
    public void testMenuEndpoint() {
        given()
          .when().get("/menu")
          .then()
             .statusCode(200)
             .body("menuitems", hasSize(2))
             .body("menuitems[0].id", is("home"))
             .body("menuitems[0].label", is("Home"))
             .body("menuitems[1].id", is("logout"))
             .body("menuitems[1].label", is("Logout"));
    }
}
