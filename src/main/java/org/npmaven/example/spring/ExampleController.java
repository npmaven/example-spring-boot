package org.npmaven.example.spring;

import groovy.lang.GroovySystem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@Controller
class ExampleController {
    @RequestMapping("/example")
    ModelAndView home() {
        Map<String, Object> model = new HashMap<>();
        model.put("groovyVersion", GroovySystem.getVersion());
        return new ModelAndView("views/example", model);
    }
}