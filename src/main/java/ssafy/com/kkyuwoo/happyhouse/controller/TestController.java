package ssafy.com.kkyuwoo.happyhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String start(Model model){
        model.addAttribute("hello", "Hello World");
        return "index";
    }
}
