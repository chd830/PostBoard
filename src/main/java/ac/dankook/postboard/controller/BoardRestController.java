package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class BoardRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BoardRestController.class);

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/rest/board", method = RequestMethod.GET)
    public List<Post> recentPostList(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        String userId = "";

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("myCookie".equals(cookie.getName())) {
                    userId = cookie.getValue();
                }
            }
        }

        List<Post> mainPosts = postService.getMainPostByUserId(userId);

        return mainPosts;
    }
}
