package ac.dankook.postboard.service;

import ac.dankook.postboard.data.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public interface UserService {
    public void setSignUpData(User user);
    public User getUserPassword(User user);
    public Boolean checkPassword(User user);
    public String Cookie(User user);
}
