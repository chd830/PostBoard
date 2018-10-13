package ac.dankook.postboard.repository;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepositoryImpl implements PostRepository {
    @Autowired
    private SqlSession sqlSession;
    private static final Logger LOGGER = LoggerFactory.getLogger(PostRepositoryImpl.class);
    public void testMybatisRepository() {
        LOGGER.debug("TestRepositoryImpl");
        sqlSession.selectOne("testMapper.insertTestData");
    }
}
