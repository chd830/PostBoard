package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static final String MAPPER = "userdataMapper";
    @Autowired
    SqlSession sqlSession;

    @Override
    public User insert(User entity) {
        return sqlSession.selectOne(MAPPER + ".insert", entity);
    }

    @Override
    public User selectOne(Long aLong) {
        return sqlSession.selectOne(MAPPER + ".getUserPassword", aLong);
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
    public int delete(Long entity) {
        return 0;
    }

    public User getPassword(User user) {
        User data = sqlSession.selectOne(MAPPER + ".getUserNo", user);
        return this.selectOne(data.getUserNo());
    }

}
