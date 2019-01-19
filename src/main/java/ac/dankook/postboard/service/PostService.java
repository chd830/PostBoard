package ac.dankook.postboard.service;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;

import java.util.LinkedHashMap;
import java.util.List;

public interface PostService {
    void setPost(Post post);

    List<Post> getPostByUserNo(String userNo);

    List<Post> getMainPostByUserNo(String userNo);

    List<Post> getList(String userNo);

    int getListCountNumber(String userNo);
}
