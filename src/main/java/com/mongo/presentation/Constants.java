package com.mongo.presentation;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	public static final Map<Integer, String> pages = new HashMap<>();

	public static final String PAGE_1 = "{\r\n" + "			\"page\": 1,\r\n"
			+ "			\"title\": \"Sprint Goal\",\r\n" + "			\"points\": {\r\n"
			+ "				\"1\": \"APP Versioning API\",\r\n" + "				\"2\": \"Products API\",\r\n"
			+ "				\"3\": \"Products Prices API\",\r\n"
			+ "				\"4\": \"BFF Products API - as a pass through API\"\r\n" + "			}\r\n" + "		}";

	public static final String PAGE_2 = "{\r\n" + "			\"page\": 2,\r\n"
			+ "			\"title\": \"Sprint Status\",\r\n" + "			\"points\": {\r\n"
			+ "				\"1\": \"APP Versioning API - Completed\",\r\n"
			+ "				\"2\": \"Products API - Completed\",\r\n"
			+ "				\"3\": \"Products Prices API - Completed\",\r\n"
			+ "				\"4\": \"BFF Products API - Completed\"\r\n" + "			}\r\n" + "		}";

	public static final String PAGE_3 = "{\r\n" + "			\"page\": 3,\r\n"
			+ "			\"title\": \"Definition of Done\",\r\n" + "			\"points\": {\r\n"
			+ "				\"1\": \"Implementation as per requiremens in JIRA\",\r\n"
			+ "				\"2\": \"Sonar Code Coverage - 80%\",\r\n"
			+ "				\"3\": \"Junit tests, Component Tests and Contract tests\",\r\n"
			+ "				\"4\": \"Standard Logging\",\r\n"
			+ "				\"5\": \"Complete - Individual microservice and end-to-end testing [between Microservices]\",\r\n"
			+ "				\"6\": \"Exception handling - Custom and Spring exceptions\",\r\n"
			+ "				\"7\": \"Slueth and Zipkin tracing - customizations\",\r\n"
			+ "				\"8\": \"Swagger documentation - as configured in template\"\r\n" + "			}\r\n"
			+ "		}";

	public static final String PAGE_4 = "{\r\n" 
			+ "			\"page\": 4,\r\n" 
			+ "			\"title\": \"Demo\",\r\n"
			+ "			\"points\": {\r\n" 
			+ "				\"1\": \"App Versioning\",\r\n"
			+ "				\"2\": \"Products API\",\r\n" 
			+ "				\"3\": \"Sonar\",\r\n"
			+ "				\"4\": \"Zipkin [Parallel Calls]\",\r\n"
			+ "				\"5\": \"PACT Broker - Products API Contract\",\r\n"
			+ "				\"6\": \"Go CD Pipeline [No enhancements in DevOps - due to access issues]\"\r\n"
			+ "			}\r\n" + "		}";
	
	
	public static final String PAGE_5 = "{\r\n" 
			+ "			\"page\": 5,\r\n" 
			+ "			\"title\": \"Review of Template\",\r\n"
			+ "			\"points\": {\r\n" 
			+ "				\"1\": \"Exception Handling - Will not work for any wrapped exceptions [Spring wraps even custom exceptions]\",\r\n"
			+ "				\"2\": \"Platform code as part of every Microservice codebase, any changes should be retrofitted across Microservices\",\r\n" 
			+ "				\"3\": \"Go CD (with custom shell scripts) vs Jenkins ( with plugins support)\",\r\n"
			+ "				\"4\": \"Tools Infra setup with freely available docker images[Sonar (including Sonar rules), Zipkin, Pact]\",\r\n"
			+ "				\"5\": \"PACT vs Spring Cloud Contract [which stores contract in Artifactory]\",\r\n"
			+ "				\"6\": \"Secret management tools integration with Spring; e.g. Spring Cloud - Azure Vault or Vault\"\r\n"
			+ "			}\r\n" + "		}";

}
