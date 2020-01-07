package com.meynier.jakarta;

import org.junit.jupiter.api.Test;
import org.microshed.testing.jaxrs.RESTClient;
import org.microshed.testing.jupiter.MicroShedTest;
import org.microshed.testing.testcontainers.ApplicationContainer;
import org.testcontainers.junit.jupiter.Container;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

@MicroShedTest
public class HelloWorldResourceIT {

    @Container
    public static ApplicationContainer app = new ApplicationContainer()
            .withAppContextRoot("/microshed-introduction")
            .withReadinessPath("/microshed-introduction/app/hello");

    @RESTClient
    public static HelloWorldResource helloWorldResource;

    @Test
    public void sayHello() throws IOException {
        String data = helloWorldResource.sayHello();

        assertTrue(data.startsWith("Hello World"));
        System.out.println(data);

    }

}
