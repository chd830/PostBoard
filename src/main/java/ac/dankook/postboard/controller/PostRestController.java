package ac.dankook.postboard.controller;

import ac.dankook.postboard.constants.UrlConstants;
import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.service.PostService;
import ac.dankook.postboard.service.UserService;
import ac.dankook.postboard.utils.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(UrlConstants.REST)
public class PostRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostRestController.class);

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public boolean writePost(@RequestParam String title, @RequestParam String content, HttpServletRequest request) {
        String userNo = HttpUtils.getUserNoFromCookie(request);

        if (StringUtils.isNotBlank(userNo)) {

            Post post = new Post();
            post.setUserNo(Integer.parseInt(userNo));
            post.setTitle(title);
            post.setContent(content);
            post.setPositive(0);
            post.setNegative(0);

            postService.setPost(post);
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Object postList(HttpServletRequest request) {

        String userNo = HttpUtils.getUserNoFromCookie(request);
        if(StringUtils.isNotBlank(userNo)) {
            ModelAndView model = new ModelAndView(new MappingJackson2JsonView());
            model.addObject("list", postService.getPostByUserNo(userNo));
            model.addObject("userName", userService.getUserName(userNo));
            return model;
        }
        return null;
    }
}