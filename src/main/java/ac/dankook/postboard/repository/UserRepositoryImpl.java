package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.LogIn;
import ac.dankook.postboard.data.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    SqlSession sqlSession;

    public void setUserData(User user) {
        sqlSession.selectOne("userdataMapper.setUserData",user);
    }
    public LogIn getUserPassword(String userId) {
        return sqlSession.selectOne("userdataMapper.getUserPassword",userId);
    }
}
