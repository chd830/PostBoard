package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.User;

public interface UserRepository extends BaseRepository<User,Long>{
    public User getPassword(User user);
//    public User getUserNo(User user);
}
