package com.estilosDeAprendizagem.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String hello() {
        return "API do EA";
    }
}
