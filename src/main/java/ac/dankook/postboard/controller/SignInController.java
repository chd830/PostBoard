package ac.dankook.postboard.controller;

import ac.dankook.postboard.utils.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class SignInController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SignInController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String signin(HttpServletRequest request, HttpServletResponse response) {
        response.addCookie(HttpUtils.deleteCookieByCookieName(request));

        if (HttpUtils.existsUserNo(request)) {
            return "redirect:/board";
        }
        return "signin";
    }


}
