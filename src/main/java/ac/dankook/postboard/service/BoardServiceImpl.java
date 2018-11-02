package ac.dankook.postboard.service;

import ac.dankook.postboard.repository.BoardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardRepository boardRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(BoardServiceImpl.class);

    public void testMybatisService() {
        LOGGER.debug("TestServiceImpl");
        boardRepository.testMybatisRepository();
    }
}
