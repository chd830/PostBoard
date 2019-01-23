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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(UrlConstants.POST)
public class PostController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostController.class);

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @RequestMapping()
    public String post(HttpServletRequest request) {
        String userNo = HttpUtils.getUserNoFromCookie(request);
        if (StringUtils.isNotBlank(userNo)) {
            return "post";
        }
        return "redirect:/";
    }

    @RequestMapping("/write")
    public String postboard(HttpServletRequest request) {
        String userNo = HttpUtils.getUserNoFromCookie(request);
        if (StringUtils.isNotBlank(userNo)) {
            return "write";
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/list")
    public String postList(HttpServletRequest request) {
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

            return "list";
        }
        return "redirect:/";
    }

}
