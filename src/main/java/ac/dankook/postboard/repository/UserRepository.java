package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.User;

public interface UserRepository extends BaseRepository<User,Integer>{
    public User getUserNo(User user);
    public User getUserName(User user);
    public User getPassword(User user);
}
