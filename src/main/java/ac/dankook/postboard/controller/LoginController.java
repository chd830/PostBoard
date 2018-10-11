package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.LogIn;
import ac.dankook.postboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
// 만세
@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/")
    public String login() {
        return "login";
    }

    @RequestMapping(value="/rest/login",method= RequestMethod.GET)
    @ResponseBody
    public String logIn(@RequestParam String userId, @RequestParam String userPw) {
        Boolean checkPw;
        LogIn login = new LogIn();
        login.setUserId(userId);
        login.setUserPw(userPw);
        checkPw = userService.checkPassword(login);
        if(checkPw)
            return "post";
        else
            return "login";
    }
}
