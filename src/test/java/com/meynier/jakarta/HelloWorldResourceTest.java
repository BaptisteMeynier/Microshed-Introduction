package com.meynier.jakarta;

import org.junit.jupiter.api.Test;
import org.microshed.testing.jupiter.MicroShedTest;
import org.microshed.testing.testcontainers.MicroProfileApplication;
import org.testcontainers.junit.jupiter.Container;

import javax.inject.Inject;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

@MicroShedTest
public class HelloWorldResourceTest {

    @Container
    public static MicroProfileApplication app = new MicroProfileApplication();

    @Inject
    public static HelloWorldResource helloWorldResource;

    @Test
    public void sayHello() throws IOException {
        String data = helloWorldResource.sayHello();

        assertTrue(data.startsWith("Hello World"));
        System.out.println(data);

    }

}
