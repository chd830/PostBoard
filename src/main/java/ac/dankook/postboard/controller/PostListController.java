package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.PostService;
import ac.dankook.postboard.service.UserService;
import ac.dankook.postboard.utils.HttpUtils;
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
    public ModelAndView postList(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("postlist");

        List<Post> list = this.getList(request);
        User user = userService.getUserInformation(HttpUtils.getUserNoFromCookie(request));
        modelAndView.addObject("list",list);

        return modelAndView;
    }

    public List<Post> getList(HttpServletRequest request) {
        List<Post> list = new ArrayList<>();
        list = postService.getPostByUserNo(HttpUtils.getUserNoFromCookie(request));
        if (!list.isEmpty()) return list;
        else return null;
    }
    public Post getUserInformation(HttpServletRequest request) {
        Post post = new Post();


    }

    public boolean nextPage(HttpServletRequest request) {
        int postCount = postService.getPostListNumber(HttpUtils.getUserNoFromCookie(request));
        if(postCount > 10) {
            return true;
        }
        else {
            return false;
        }

    }
}
