package com.whatsupdev.gradeFood.api.google;

import com.whatsupdev.gradeFood.api.StatusHandler;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;


@Component
public class GoogleStatusHandler extends StatusHandler {

    protected static Throwable handle(ClientResponse response) {
        HttpStatus httpStatus = HttpStatus.valueOf(response.statusCode().value());
        // ToDo: Implement exception handling later
        switch (httpStatus) {
            case NOT_FOUND:
                return new Exception("Resource not found");
            case BAD_REQUEST:
                return new Exception("Bad request");
            default:
                return new RuntimeException("Unknown error occurred");
        }
    }
}
