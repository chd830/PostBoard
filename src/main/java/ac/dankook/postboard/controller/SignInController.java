package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.UserService;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.CookieGenerator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SignInController {
    private static Logger LOGGER = LoggerFactory.getLogger(SignInController.class);
    @Autowired
    UserService userService;

    @RequestMapping(value = "/")
    public String signin() {
        return "signin";
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/rest/signin", method = RequestMethod.GET)
    @ResponseBody
    public String logIn(@RequestParam String userId, @RequestParam String userPw, HttpServletResponse response) {

        CookieGenerator cookie = new CookieGenerator();
        cookie.setCookieName("cookie");
        cookie.addCookie(response,Integer.toString(userService.getUserNo(userId)));

        User user = new User();
        user.setUserId(userId);
        user.setUserPw(userPw);
        JSONObject json = new JSONObject();
        json.put("result", userService.checkPassword(user));

        return json.toJSONString();
    }
}
