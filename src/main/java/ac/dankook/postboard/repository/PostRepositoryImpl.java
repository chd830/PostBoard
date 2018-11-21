package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepositoryImpl implements PostRepository {
    private final static String MAPPER = "postdataMapper";

    @Autowired
    SqlSession sqlSession;


    @Override
    public Post insert(Post entity) {
        return sqlSession.selectOne(MAPPER+".insertPost",entity);
    }

    @Override
    public Post selectOne(Integer integer) {
        return null;
    }

    @Override
    public List<Post> selectList(Object criteria) {
        return sqlSession.selectList(MAPPER+".select",criteria);
    }
    public List<String> getTitle(User user) {
        return sqlSession.selectList(MAPPER+".selectTitle",user);
    }
    public List<String> getContent(User user) {
        return sqlSession.selectList(MAPPER+".selectContent",user);
    }
    @Override
    public int update(Post entity) {
        return 0;
    }

    @Override
    public int delete(Integer entity) {
        return 0;
    }



    public List<Post> selectListByUserNo(String userNo) {
        return sqlSession.selectList(MAPPER+".selectListByUserNo", userNo);
    }

    public List<Post> selectMainPostByUserNo(String userNo) {
        return sqlSession.selectList(MAPPER+".selectMainPostByUserNo", userNo);
    }

    public List<Post> selectMainPostByUserId(String userId) {
        return sqlSession.selectList(MAPPER+".selectMainPostByUserId", userId);
    }
}
