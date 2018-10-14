package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/")
    public String login() {
        return "login";
    }
//    public Cookie makeCookie(HttpServletResponse response,String userId) {
//        Cookie cookie = new Cookie("userId",userId);
//        cookie.setMaxAge(60*60*1);
//        response.addCookie(cookie);
//        return cookie;
//    }

    @RequestMapping(value="/rest/login",method= RequestMethod.GET)
    @ResponseBody
    public String logIn(@RequestParam String userId, @RequestParam String userPw,HttpServletResponse response) {
        Boolean checkPw;
        User user = new User();
        user.setUserId(userId);
        user.setUserPw(userPw);
        user.setUserName(" ");
        user.setEmail(" ");
        checkPw = userService.checkPassword(user);
        if(checkPw)
            return "post";
        else
            return " ";
    }
}
