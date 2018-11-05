package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostRestController.class);

    @Autowired
    PostService postService;

    @RequestMapping(value = "/rest/write", method = RequestMethod.GET)
    public void writePost(@RequestParam String title, @RequestParam String content) {
        User user = new User();
        user.setUserId("chd830");
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        post.setPositive(0);
        post.setNegative(0);
        postService.setPost(post,user);
    }

}
