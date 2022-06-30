package com.oci.danie1r;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Inject;


@MicronautTest
public class SignRequestController {
//    private static final Logger LOG = LoggerFactory.getLogger(SignRequestController.class);
    @Inject
    @Client("https://ocitest.signrequest.com/api/v1/documents/")
    HttpClient client;

    void testing() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/152408ef-4b71-40a4-9416-92011a443450"));

    }
}

