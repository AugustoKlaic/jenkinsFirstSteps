package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class SendHelloWorld {

    private final Writer writer = new Writer();

    @GetMapping("/hello")
    public String sayHello() {
        return writer.writeMessage("Hello World!");
    }
}
