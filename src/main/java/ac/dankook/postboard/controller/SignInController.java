package ac.dankook.postboard.controller;

import ac.dankook.postboard.constants.HttpConstants;
import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/signin")
public class SignInController {
    private static Logger LOGGER = LoggerFactory.getLogger(SignInController.class);

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String signin(HttpServletResponse response, HttpServletRequest request) {
        String userNo = null;
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (HttpConstants.COOKIE_NAME.equals(cookie.getName())) {
                    userNo = cookie.getValue();
                }
            }

            if (StringUtils.isNotBlank(userNo)) {
                return "redirect:/board";
            }
        }
        return "signin";
    }


}
