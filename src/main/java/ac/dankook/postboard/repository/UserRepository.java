package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.User;

public interface UserRepository {
    public void setUserData(User user);
    public User getUserPassword(User user);
}
