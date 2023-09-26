package com.whatsupdev.gradeFood.api;

import org.springframework.web.reactive.function.client.ClientResponse;

public abstract class StatusHandler {
    protected static Throwable handle(ClientResponse clientResponse){
        return null;
    }
}
