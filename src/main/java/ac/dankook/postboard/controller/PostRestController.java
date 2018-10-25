package ac.dankook.postboard.controller;

import ac.dankook.postboard.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PostRestController.class);

    @Autowired
    private PostService postService;

//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public void test() {
//        LOGGER.debug("TestRestController");
//        postService.testMybatisService();
//    }
}
