package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.service.PostService;
import ac.dankook.postboard.service.UserService;
import ac.dankook.postboard.utils.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PostListController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostListController.class);

    @Autowired
    PostService postService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/post/post_list")
    public Object postList(HttpServletRequest request) {
        String userNo = HttpUtils.getUserNoFromCookie(request);
        if (StringUtils.isNotBlank(userNo)) {
            ModelAndView modelAndView = new ModelAndView("postlist");

            List<Post> list = this.getList(request);

            String userName = userService.getUserName(userNo);

            modelAndView.addObject("list", list);
            modelAndView.addObject("user", userName);

            return modelAndView;
        }
        else
            return "redirect:/";
    }

    public List<Post> getList(HttpServletRequest request) {
        List<Post> list = new ArrayList<>();
        list = postService.getPostByUserNo(HttpUtils.getUserNoFromCookie(request));
        if (!list.isEmpty()) return list;
        else return null;
    }

    public boolean nextPage(HttpServletRequest request) {
        int postCount = postService.getPostListNumber(HttpUtils.getUserNoFromCookie(request));
        if (postCount > 10) {
            return true;
        } else {
            return false;
        }

    }
}
