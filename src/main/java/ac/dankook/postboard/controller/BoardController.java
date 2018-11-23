package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String board(Model model) {
        LOGGER.debug("PostController");
//        model.addAttribute("topPost", postService.asdkfljsdlf());
        return "board";
    }

    @ResponseBody
    @RequestMapping(value = "/rest/board", method = RequestMethod.GET)
    public List<Post> recentPostList(HttpServletRequest request) {
        String userNo = "";
        Cookie[] cookie = request.getCookies();
        if (cookie != null) {
            for (int i = 0; i < cookie.length; i++)
                if ("cookie".equals(cookie[i].getName()))
                    userNo = cookie[i].getValue();
        }
        return postService.getMainPostByUserNo(userNo);
    }
}
