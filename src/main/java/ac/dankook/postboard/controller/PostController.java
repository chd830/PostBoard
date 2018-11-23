package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpServerErrorException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PostController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostController.class);

    @Autowired
    PostService postService;

    @RequestMapping("/write")
    public String postboard() {
        return "writepost";
    }

    @ResponseBody
    @RequestMapping(value = "/rest/write", method = RequestMethod.GET)
    public void writePost(@RequestParam String title, @RequestParam String content, HttpServletRequest request) {
        LOGGER.debug("PostController");

        String userNo = "";
        Cookie[] cookie = request.getCookies();
        if (cookie != null) {
            for (int i = 0; i < cookie.length; i++)
                if ("cookie".equals(cookie[i].getName()))
                    userNo = cookie[i].getValue();
        }

        Post post = new Post();
        post.setUserNo(Integer.parseInt(userNo));
        post.setTitle(title);
        post.setContent(content);
        post.setPositive(0);
        post.setNegative(0);

        postService.setPost(post);
    }


}
