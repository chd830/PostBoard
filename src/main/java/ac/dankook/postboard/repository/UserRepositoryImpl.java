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
        User user = sqlSession.selectOne(MAPPER + ".selectUserNo", userId);
        if (user != null) {
            return user;
        } else {
            return null;
        }
    }

    public User getUserName(int userNo) {

        return sqlSession.selectOne(MAPPER + ".selectUserName", userNo);
    }

    public User getPassword(User user) {
        User user1 = this.selectOne(this.getUserNo(user.getUserId()).getUserNo());
        return user1;
    }

    public User getUserInformation(String userNo) {
        User user = sqlSession.selectOne(MAPPER + ".selectUserInformationByUserNo",userNo);
        return user;
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
