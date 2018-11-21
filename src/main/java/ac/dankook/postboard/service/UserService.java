package ac.dankook.postboard.service;

import ac.dankook.postboard.data.User;

public interface UserService {
    void setSignUpData(User user);

    int getUserNo(String userId);

    String getUserPassword(User user);

    boolean checkPassword(User user);
}
