package ac.dankook.postboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BoardRestController.class);

//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public void test() {
//        LOGGER.debug("TestRestController");
//        postService.testMybatisService();
//    }
}
