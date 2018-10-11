package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

    private static Logger LOGGER = LoggerFactory.getLogger(SignUpController.class);
    @Autowired
    UserService userService;

    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }

    @RequestMapping(value="/rest/signup",method= RequestMethod.POST)
    public void setUserData(@RequestParam String userId,@RequestParam String userPw,@RequestParam String userName,@RequestParam String email) {
        User user= new User();
        user.setUserId(userId);
        user.setUserPw(userPw);
        user.setUserName(userName);
        user.setEmail(email);
        userService.setSignUpData(user);
    }

}
