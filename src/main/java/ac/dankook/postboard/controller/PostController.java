package ac.dankook.postboard.controller;

import ac.dankook.postboard.constants.UrlConstants;
import ac.dankook.postboard.utils.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(UrlConstants.POST)
public class PostController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostController.class);

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
            return "list";
        }
        return "redirect:/";
    }
}
