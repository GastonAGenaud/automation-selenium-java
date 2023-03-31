package SessionManager;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.JSONObject;

import java.util.Map;

public class APIUtils {

    public Map<String, String> postCallGetCookies(JSONObject jsonPayload, String Uri){
        return RestAssured.given()
                .baseUri(Uri)
                .accept(ContentType.JSON)
                .body(jsonPayload.toString())
                .when()
                .post()
                .getCookies();

    }

}