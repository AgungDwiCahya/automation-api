package org.example;

import java.time.LocalDateTime;

@Path()
@RequestScoped
@Controller
public class HelloController {

    @Inject
    Models models;

    @GET
    public String hello() {
        models.put("message", "Today is " + LocalDateTime.now());
        return "hello.xhtml";
    }
}
