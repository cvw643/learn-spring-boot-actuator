package com.github.cvw643;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "sample")
public class SampleEndpoint {
    @ReadOperation
    public String read() {
        return "Hello";
    }
}
