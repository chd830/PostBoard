package ac.dankook.postboard.service;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;

public interface PostService {
    public void setPost(Post post, User user);
}
