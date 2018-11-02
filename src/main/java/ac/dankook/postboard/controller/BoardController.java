package ac.dankook.postboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BoardController {
    private static Logger LOGGER = LoggerFactory.getLogger(BoardController.class);
    @RequestMapping("/")
    public String test() {
        LOGGER.debug("PostController");
        return "board";
    }
}