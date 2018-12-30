package ac.dankook.postboard.controller;

import ac.dankook.postboard.service.UserService;
import ac.dankook.postboard.utils.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class SignInController {
    private static Logger LOGGER = LoggerFactory.getLogger(SignInController.class);

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String signin(HttpServletRequest request, HttpServletResponse response) {
        response.addCookie(HttpUtils.deleteCookieByCookieName(request));
        String userNo = HttpUtils.getUserNoFromCookie(request);
        if (StringUtils.isNotBlank(userNo)) {
            return "redirect:/board";
        }
        return "signin";
    }


}
