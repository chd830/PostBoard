package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static final String MAPPER = "userMapper";
    @Autowired
    SqlSession sqlSession;

    public User getUserNo(String userId) {
        return sqlSession.selectOne(MAPPER + ".selectUserNo", userId);
    }

    public User getUserName(int userNo) {
        return sqlSession.selectOne(MAPPER + ".selectUserName", userNo);
    }

    public User getPassword(User user) {
        return this.selectOne(this.getUserNo(user.getUserId()).getUserNo());
    }

    @Override
    public User insert(User entity) {
        return sqlSession.selectOne(MAPPER + ".insert", entity);
    }

    @Override
    public User selectOne(Integer integer) {
        return sqlSession.selectOne(MAPPER + ".selectUserPassword", integer);
    }

    @Override
    public List<User> selectList(Object criteria) {
        return null;
    }

    @Override
    public int update(User entity) {
        return 0;
    }

    @Override
    public int delete(Integer entity) {
        return 0;
    }
}
