package ac.dankook.postboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PostController {
    private static Logger LOGGER = LoggerFactory.getLogger(PostController.class);
    @RequestMapping("/post")
    public String test() {
        LOGGER.debug("PostController");
        return "post";
    }
}
