package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.Post;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepositoryImpl implements PostRepository {
    @Autowired
    SqlSession sqlSession;


    @Override
    public Post insert(Post entity) {
        return sqlSession.selectOne("postdataMapper.insertPost",entity);
    }

    @Override
    public Post selectOne(Integer integer) {
        return null;
    }

    @Override
    public List<Post> selectList(Object criteria) {
        return null;
    }

    @Override
    public int update(Post entity) {
        return 0;
    }

    @Override
    public int delete(Integer entity) {
        return 0;
    }
}
