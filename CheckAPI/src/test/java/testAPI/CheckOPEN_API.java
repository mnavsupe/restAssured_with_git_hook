package testAPI;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
//import static io.restassured.RestAssured.*;

public class CheckOPEN_API {
	
		static String endpoint = "https://api.agify.io/?name=bella";
		@Test
		public static void Check()
		{
			System.out.println("Test");
		}
	
		@Test
		public static void API()
		{
			given().when().get(endpoint).then().assertThat().statusCode(200);
			
		}
}