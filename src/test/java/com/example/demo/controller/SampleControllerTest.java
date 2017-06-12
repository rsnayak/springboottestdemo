package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SampleControllerTest {

    @Value("${base.url}")
    private String BASE_URL;

    private TestRestTemplate restTemplate = new TestRestTemplate(); //provide creds here if endpoints are secured

    @Test
    public void testHomeEndpoint() {
        String hello = restTemplate.getForObject(BASE_URL + "/hello", String.class);
        assertEquals("Hello World! should have been returned", "Hello World!", hello);
    }

}
