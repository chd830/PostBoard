package ac.dankook.postboard.service;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.repository.PostRepository;
import ac.dankook.postboard.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostService.class);

    @Autowired
    PostRepository postRepository;
    @Autowired
    UserRepository userRepository;

    public void setPost(Post post) {
        post.setUserName(userRepository.getUserName(post.getUserNo()).getUserName());
        postRepository.insert(post);
    }
    public List<Post> getPostNameByUserNo(String userNo) {
        List<Post> postList = postRepository.selectPostListByUserNo(userNo);
        return postList;
    }
    public List<Post> getMainPostByUserNo(String userNo) {
        List<Post> postList = postRepository.selectPostListByUserNo(userNo);
        List<Post> topThreePost = new ArrayList<>();
        int size=postList.size();
        if (postList.size() < 3)
            for (int i = size; i >0; i--)
                topThreePost.add(postList.get(i-1));
        else {
            for (int i = size - 1; i > postList.size() - 4; i--)
                topThreePost.add(postList.get(i));
        }
        if (postList != null)
            return topThreePost;
        else
            return null;
    }

}
