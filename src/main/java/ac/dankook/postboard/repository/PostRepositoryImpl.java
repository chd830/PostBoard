package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepositoryImpl implements PostRepository {
    private final static String MAPPER = "postMapper";

    @Autowired
    SqlSession sqlSession;


    @Override
    public Post insert(Post entity) { return sqlSession.selectOne(MAPPER + ".insertPost", entity); }

    @Override
    public Post selectOne(Integer integer) {
        return null;
    }

    @Override
    public List<Post> selectList(Object criteria) {
        return sqlSession.selectList(MAPPER + ".select", criteria);
    }

    @Override
    public int update(Post entity) {
        return 0;
    }

    @Override
    public int delete(Integer entity) {
        return 0;
    }


    public List<Post> selectPostListByUserNo(String userNo) {
        return sqlSession.selectList(MAPPER + ".selectListByUserNo", userNo);
    }

}
