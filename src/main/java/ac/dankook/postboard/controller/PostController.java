package ac.dankook.postboard.controller;

import ac.dankook.postboard.constants.UrlConstants;
import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.PostService;
import ac.dankook.postboard.utils.HttpUtils;
import org.apache.commons.lang3.StringUtils;
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
@RequestMapping(UrlConstants.POST)
public class PostController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostController.class);

    @Autowired
    PostService postService;

    @RequestMapping()
    public String post() {
        return "post";
    }

    @RequestMapping("/post_list")
    public String postList() {
        return "postlist";
    }

    @RequestMapping("/write_post")
    public String postboard() {
        return "writepost";
    }




}
