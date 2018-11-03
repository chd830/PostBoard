package ac.dankook.postboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
    @RequestMapping("/write")
    public String postboard() {
        return "writepost";
    }
}
