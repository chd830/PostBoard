package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.User;

public interface UserRepository extends BaseRepository<User, Integer> {
    User getUserNo(String userId);

    User getUserName(int userNo);

    User getPassword(User user);

    User getUserName(String userNo);
}
