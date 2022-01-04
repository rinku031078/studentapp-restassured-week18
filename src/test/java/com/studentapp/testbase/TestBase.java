package com.studentapp.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass
    public static void initialize(){
        RestAssured.baseURI="http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath="/student";
    }
}
