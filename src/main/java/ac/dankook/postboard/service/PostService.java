package ac.dankook.postboard.service;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;

import java.util.LinkedHashMap;
import java.util.List;

public interface PostService {
    public void setPost(Post post, User user);

    public LinkedHashMap<String, String> getPost(User user);

    public List<String> getPostTitle(User user);

    public List<String> getPostContent(User user);


    List<Post> getPostListByUserNo(String userNo);

    List<Post> getMainPostByUserNo(String userNo);

    List<Post> getMainPostByUserId(String userId);
}
