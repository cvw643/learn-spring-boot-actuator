package com.github.cvw643;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "sample")
public class SampleEndpoint {
    private final SampleService sampleService;

    public SampleEndpoint(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @ReadOperation
    public String read() {
        return "Hello";
    }

    @WriteOperation
    public String echo(String content) {
        return sampleService.echo(content);
    }
}
