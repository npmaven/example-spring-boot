package org.npmaven.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class ExampleController {
    @RequestMapping("/example")
    ModelAndView home() {
        return new ModelAndView("views/example");
    }
}