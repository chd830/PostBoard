package ac.dankook.postboard.controller;

import ac.dankook.postboard.service.PostService;
import ac.dankook.postboard.service.UserService;
import ac.dankook.postboard.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class PostListRestController {

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "rest/postlist")
    public String getList(HttpServletRequest request) {
        String userNo = HttpUtils.getUserNoFromCookie(request);
        return "";
    }

}
