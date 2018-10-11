package ac.dankook.postboard.service;

import ac.dankook.postboard.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(PostServiceImpl.class);

    public void testMybatisService() {
        LOGGER.debug("TestServiceImpl");
        postRepository.testMybatisRepository();
    }
}
