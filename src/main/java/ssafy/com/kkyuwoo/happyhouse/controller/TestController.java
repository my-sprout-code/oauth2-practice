package ssafy.com.kkyuwoo.happyhouse.controller;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
=======
import org.springframework.ui.Model;
>>>>>>> d4cea819eeaa976cb42f932c31af11fd71d9c532
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
<<<<<<< HEAD
    public String index() {
=======
    public String start(Model model){
        model.addAttribute("hello", "Hello World");
>>>>>>> d4cea819eeaa976cb42f932c31af11fd71d9c532
        return "index";
    }
}
