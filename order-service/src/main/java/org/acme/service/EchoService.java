package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EchoService {

    public String echo(String value) {
        return value;
    }
}
