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
    public static boolean check=false;

    @Autowired
    PostService postService;

    @RequestMapping("/post")
    public String post() {
        return "post";
    }
    @RequestMapping("/write")
    public String postboard() {
        if(check)
            return "writepost";
        else
            return "signin";
    }

    @ResponseBody
    @RequestMapping(value = "/rest/write", method = RequestMethod.GET)
    public void writePost(@RequestParam String title, @RequestParam String content, HttpServletRequest request) {
        LOGGER.debug("PostController");
        String userNo = "";
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies)
                if ("cookie".equals(cookie.getName()))
                    userNo = cookie.getValue();
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
