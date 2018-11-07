package ac.dankook.postboard.service;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;
import ac.dankook.postboard.repository.PostRepository;
import ac.dankook.postboard.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostServiceImpl implements PostService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostService.class);

    @Autowired
    PostRepository postRepository;
    @Autowired
    UserRepository userRepository;

    public void setPost(Post post, User user) {
        post.setUserNo(userRepository.getUserNo(user).getUserNo());
        post.setUserName(userRepository.getUserName(user).getUserName());
        postRepository.insert(post);
    }

    public List<String[]> getPost(User user) {
        List<String[]> post=new ArrayList<>();
        post.add(this.getPostTitle(user).toArray(new String[3]));
        post.add(this.getPostContent(user).toArray(new String[3]));
        return post;
    }

    public List<String> getPostTitle(User user) {
        return postRepository.getTitle(userRepository.getUserNo(user));
    }

    public List<String> getPostContent(User user) {
        return postRepository.getContent(userRepository.getUserNo(user));
    }
}
