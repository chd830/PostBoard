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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;
import java.util.Map;

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
            Model model = new Model() {
                @Override
                public Model addAttribute(String s, Object o) {
                    return null;
                }

                @Override
                public Model addAttribute(Object o) {
                    return null;
                }

                @Override
                public Model addAllAttributes(Collection<?> collection) {
                    return null;
                }

                @Override
                public Model addAllAttributes(Map<String, ?> map) {
                    return null;
                }

                @Override
                public Model mergeAttributes(Map<String, ?> map) {
                    return null;
                }

                @Override
                public boolean containsAttribute(String s) {
                    return false;
                }

                @Override
                public Map<String, Object> asMap() {
                    return null;
                }
            };

            List<Post> list = postService.getList(userNo);

            String userName = userService.getUserName(userNo);
            model.addAttribute("list", list);
            model.addAttribute("user", userName);

            return model;
        }
        return "redirect:/";
    }
}
