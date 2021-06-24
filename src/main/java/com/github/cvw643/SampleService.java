package com.github.cvw643;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public String echo(String content) {
        return content;
    }
}
