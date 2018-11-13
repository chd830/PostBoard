package ac.dankook.postboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BoardController {
    private static Logger LOGGER = LoggerFactory.getLogger(BoardController.class);

    @RequestMapping("/")
    public String test(Model model) {
        // 쿠키이름을 가져오고 그게 null인지 체크
        // 만약 null

        // return "redirect:/signin";
        LOGGER.debug("PostController");

        model.addAttribute("topPost", postService.asdkfljsdlf());
        return "board";
    }
}
