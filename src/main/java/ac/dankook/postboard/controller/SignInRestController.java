package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.User;
import ac.dankook.postboard.service.UserService;
import ac.dankook.postboard.utils.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class SignInRestController {

    @Autowired
    UserService userService;

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/signin/rest", method = RequestMethod.GET)
    public String logIn(@RequestParam String userId, @RequestParam String userPw, HttpServletResponse response) {
        String userNo = Integer.toString(userService.getUserNo(userId));
        if(StringUtils.isBlank(userNo)) {
            return "";
        }

        response.addCookie(HttpUtils.setCookie(userNo));

        User user = new User();
        user.setUserId(userId);
        user.setUserPw(userPw);

        JSONObject json = new JSONObject();
        json.put("result", userService.checkPassword(user));
        return json.toJSONString();
    }
}
