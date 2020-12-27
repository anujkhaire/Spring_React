package com.app.backend.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
    @RequestMapping("/balance")
    Double fetchBalance(){
        return 10000d;
    }
}
