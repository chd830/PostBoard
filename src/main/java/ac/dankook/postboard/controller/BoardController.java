package ac.dankook.postboard.controller;

import ac.dankook.postboard.constants.HttpConstants;
import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.service.PostService;
import ac.dankook.postboard.utils.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class BoardController {
    private static Logger LOGGER = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    PostService postService;

    @RequestMapping("/board")
    public String board(HttpServletRequest request) {
        LOGGER.debug("PostController");

        String userNo = HttpUtils.getUserNoFromCookie(request);
        if (StringUtils.isNotBlank(userNo)) {
            return "board";
        }
        return "redirect:/";
    }

    @ResponseBody
    @RequestMapping(value = "/rest/board", method = RequestMethod.GET)
    public List<Post> recentPostList(@CookieValue(value = HttpConstants.COOKIE_NAME) Cookie cookie) {

        String userNo = cookie.getValue();
        if (StringUtils.isNotBlank(userNo)) {
            return postService.getMainPostByUserNo(userNo);
        }
        return null;
    }
}
