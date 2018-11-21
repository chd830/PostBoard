package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.User;

public interface UserRepository extends BaseRepository<User, Integer> {
    User getUserNo(String userId);

    User getUserName(User user);

    User getPassword(User user);
}
