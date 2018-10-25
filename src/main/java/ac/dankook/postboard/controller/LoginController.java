package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    private static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    UserService userService;

    @RequestMapping(value="/")
    public String login() {
        LOGGER.debug("LogInController");
        return "login";
    }

    @RequestMapping(value="/rest/login",method= RequestMethod.GET)
    @ResponseBody
    public Boolean logIn(@RequestParam String userId, @RequestParam String userPw,HttpServletResponse response) {
        Boolean checkPw;
        User user = new User();
        user.setUserId(userId);
        user.setUserPw(userPw);
        user.setUserName(" ");
        user.setEmail(" ");
        checkPw = userService.checkPassword(user);
        return checkPw;
    }
}
