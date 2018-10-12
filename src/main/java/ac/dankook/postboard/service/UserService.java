package ac.dankook.postboard.service;

import ac.dankook.postboard.data.User;

public interface UserService {
    public void setSignUpData(User user);
    public User getUserPassword(User user);
    public Boolean checkPassword(User user);
}
