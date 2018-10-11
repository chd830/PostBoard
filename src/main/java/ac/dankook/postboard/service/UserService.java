package ac.dankook.postboard.service;

import ac.dankook.postboard.data.LogIn;
import ac.dankook.postboard.data.User;

public interface UserService {
    public void setSignUpData(User user);
    public LogIn getUserPassword(LogIn login);
    public Boolean checkPassword(LogIn login);
}
