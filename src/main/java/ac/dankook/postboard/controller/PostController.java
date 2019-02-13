package ac.dankook.postboard.controller;

import ac.dankook.postboard.constants.UrlConstants;
import ac.dankook.postboard.service.PostService;
import ac.dankook.postboard.service.UserService;
import ac.dankook.postboard.utils.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(UrlConstants.POST)
public class PostController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostController.class);

    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @RequestMapping()
    public String post(HttpServletRequest request) {
        String userNo = HttpUtils.getUserNoFromCookie(request);
        if (HttpUtils.existsUserNo(request)) {
            return "post";
        }
        return "redirect:/";
    }

    @RequestMapping("/write")
    public String postboard(HttpServletRequest request) {
        String userNo = HttpUtils.getUserNoFromCookie(request);
        if (HttpUtils.existsUserNo(request)) {
            return "write";
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/list")
    public String postList(Model model, HttpServletRequest request) {
        String userNo = HttpUtils.getUserNoFromCookie(request);
        if (HttpUtils.existsUserNo(request)) {
            model.addAttribute("list", postService.getPostByUserNo(userNo));
            model.addAttribute("userName", userService.getUserName(userNo));
            return "list";
        }
        return "redirect:/";
    }
}
