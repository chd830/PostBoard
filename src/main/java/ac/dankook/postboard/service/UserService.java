package ac.dankook.postboard.service;

import ac.dankook.postboard.data.User;

public interface UserService {
    public void setSignUpData(User user);
    public String getUserPassword(User user);
    public boolean checkPassword(User user);
}
